package pt.lzgpom.interview.graphgeneral.courseschedule2

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        val graph = createPrerequisitesGraph(prerequisites)
        val inDegrees = inDegreesOfGraph(numCourses, prerequisites)
        
        val nodesWithNoIncoming: Queue<Int> = LinkedList()
        for (entry in inDegrees) {
           if (entry.value == 0) {
               nodesWithNoIncoming.add(entry.key)
           }
        }

        val topologicalOrder = ArrayList<Int>()

        while (nodesWithNoIncoming.isNotEmpty()) {
            val course = nodesWithNoIncoming.poll()
            topologicalOrder.add(course)

            val courseRequirements = graph[course] ?: emptyList()

            for (requisiteCourse in courseRequirements) {
                inDegrees[requisiteCourse] = inDegrees[requisiteCourse]!! - 1

                if (inDegrees[requisiteCourse] == 0) {
                    nodesWithNoIncoming.add(requisiteCourse)
                }
            }
        }

        if (topologicalOrder.size != numCourses) {
            return intArrayOf()
        }
        
        return topologicalOrder.reversed().toIntArray()
    }

    private fun createPrerequisitesGraph(prerequisites: Array<IntArray>): Map<Int, List<Int>> {
        val graph = HashMap<Int, MutableList<Int>>()

        for (prerequisite in prerequisites) {
            val (course, requisite) = prerequisite

            val coursePrerequisite = graph.computeIfAbsent(course) { ArrayList() }
            coursePrerequisite.add(requisite)
        }

        return graph
    }

    private fun inDegreesOfGraph(numCourses: Int, prerequisites: Array<IntArray>): MutableMap<Int, Int> {
        val inDegrees = HashMap<Int, Int>()

        for (node in 0 until numCourses) {
            inDegrees[node] = 0
        }

        for (prerequisite in prerequisites) {
            val requisite = prerequisite[1]
            inDegrees[requisite] = inDegrees[requisite]!! + 1
        }

        return inDegrees
    }
}