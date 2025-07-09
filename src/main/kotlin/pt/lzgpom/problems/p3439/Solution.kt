package pt.lzgpom.problems.p3439

class Solution {
    fun maxFreeTime(eventTime: Int, k: Int, startTime: IntArray, endTime: IntArray): Int {
        val n = startTime.size
        val intervals = IntArray(n + 1)
        intervals[0] = startTime.first()

        for (i in 0 until n - 1) {
            intervals[i + 1] = startTime[i + 1] - endTime[i]
        }

        intervals[n] = eventTime - endTime.last()

        var sum = 0
        var count = 0
        var max = 0

        for (i in intervals.indices) {
            sum += intervals[i]
            count++

            if (count > k + 1) {
                sum -= intervals[i - k - 1]
                count--
            }

            if (sum > max) {
                max = sum
            }
        }

        return max
    }
}