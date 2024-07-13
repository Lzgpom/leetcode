package pt.lzgpom.interview.graphgeneral.courseschedule

class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = createPrerequisitesGraph(prerequisites)

        val checkedCourses = HashSet<Int>()

        fun checkCourse(course: Int, seen: Set<Int>): Boolean {
            if (checkedCourses.contains(course)) {
                return true
            }

            if (seen.contains(course)) {
                return false
            }

            if (!graph.contains(course)) {
                checkedCourses.add(course)
                return true
            }

            val coursePrerequisites = graph[course]!!

            for (requisite in coursePrerequisites) {
                if (!checkCourse(requisite, seen + course)) {
                    return false
                }
            }

            checkedCourses.add(course)
            return true
        }

        for (i in 0 until numCourses) {
            if (!checkCourse(i, HashSet())) {
                return false
            }
        }

        return true
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
}