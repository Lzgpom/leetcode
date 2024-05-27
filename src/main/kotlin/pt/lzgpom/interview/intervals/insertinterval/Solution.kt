package pt.lzgpom.interview.intervals.insertinterval

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        var inserted = false
        val newIntervals = mutableListOf<IntArray>()

        for (interval in intervals) {
            if (!inserted && isIntervalBeforeOther(newInterval, interval)) {
                newIntervals.add(newInterval)
                newIntervals.add(interval)
                inserted = true
            } else if (doIntervalsIntersect(newInterval, interval)) {
                newInterval[0] = min(newInterval[0], interval[0])
                newInterval[1] = max(newInterval[1], interval[1])
            } else {
                newIntervals.add(interval)
            }
        }

        if (!inserted) {
            newIntervals.add(newInterval)
        }

        return newIntervals.toTypedArray()
    }

    private fun isIntervalBeforeOther(interval: IntArray, other: IntArray): Boolean {
        return interval[1] < other[0]
    }

    private fun doIntervalsIntersect(interval1: IntArray, interval2: IntArray): Boolean {
        return (interval1[0] <= interval2[0] && interval2[0] <= interval1[1])
                || (interval1[0] <= interval2[1] && interval2[1] <= interval1[1])
                || (interval2[0] <= interval1[0] && interval1[0] <= interval2[1])
                || (interval2[0] <= interval1[1] && interval1[1] <= interval2[1])
    }
}