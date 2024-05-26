package pt.lzgpom.interview.intervals.mergeintervals

import kotlin.math.max

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }

        val mergedIntervals = mutableListOf<IntArray>()

        var currentInterval = intervals.first()
        for (i in 1 .. intervals.lastIndex) {
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = max(currentInterval[1], intervals[i][1])
            } else {
                mergedIntervals.add(currentInterval)
                currentInterval = intervals[i]
            }
        }

        mergedIntervals.add(currentInterval)

        return mergedIntervals.toTypedArray()
    }
}