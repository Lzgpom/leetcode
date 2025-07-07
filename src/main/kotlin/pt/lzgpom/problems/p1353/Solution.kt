package pt.lzgpom.problems.p1353

import java.util.*

class Solution {
    fun maxEvents(events: Array<IntArray>): Int {
        val maxDay = events.maxOf { it[1] }

        val endDays = PriorityQueue<Int>()
        events.sortBy { it[0] }

        var i = 0
        var result = 0
        for (day in 1..maxDay) {
            while (endDays.isNotEmpty() && endDays.peek() < day) {
                endDays.poll()
            }

            while (i < events.size && events[i][0] <= day) {
                endDays.offer(events[i][1])
                i++
            }

            if (endDays.isNotEmpty()) {
                endDays.poll()
                result++
            }
        }

        return result
    }
}