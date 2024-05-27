package pt.lzgpom.interview.intervals.minimumnumberofarroestoburstballoons

class Solution {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortBy { it[1] }

        var counter = 1
        var currentMax = points[0][1]

        for (i in 1 until points.size) {
           if (points[i][0] > currentMax) {
               counter++
               currentMax = points[i][1]
           }
        }

        return counter
    }
}