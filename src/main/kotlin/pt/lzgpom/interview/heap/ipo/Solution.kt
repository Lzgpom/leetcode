package pt.lzgpom.interview.heap.ipo

import java.util.*

class Solution {
    fun findMaximizedCapital(k: Int, w: Int, profits: IntArray, capitals: IntArray): Int {
        var currentCapital = w
        var remainingProjects = k
        val projects = createProjectPriorityQueue(profits, capitals)

        while (remainingProjects > 0) {
            val project = findProjectWithMostProfitWithCapital(projects, currentCapital) ?: return currentCapital

            currentCapital += project.profit
            remainingProjects--
        }

        return currentCapital
    }

    private fun createProjectPriorityQueue(profits: IntArray, capitals: IntArray): LinkedList<Project> {
        val projects = LinkedList<Project>()
        profits.forEachIndexed { index, profit ->
            projects.add(Project(profit, capitals[index]))
        }

        projects.sort()

        return projects
    }

    private fun findProjectWithMostProfitWithCapital(projects: LinkedList<Project>, capital: Int): Project? {
        val iterator = projects.iterator()
        while (iterator.hasNext()) {
            val project = iterator.next()

            if (project.capital <= capital) {
                iterator.remove()
                return project
            }
        }

        return null
    }

    private class Project(val profit: Int, val capital: Int) : Comparable<Project> {
        override fun compareTo(other: Project): Int {
            return other.profit - this.profit
        }
    }
}