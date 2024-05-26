package pt.lzgpom.interview.intervals

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) {
            return emptyList()
        }

        val ranges = mutableListOf<String>()

        var start = nums.first()
        var end = nums.first()
        for (i in 1..nums.lastIndex) {
            val num = nums[i]

            if (end + 1 == num) {
                end = num
            } else {
                ranges.add(rangeString(start, end))
                start = num
                end = num
            }
        }

        ranges.add(rangeString(start, end))

        return ranges
    }

    private fun rangeString(start: Int, end: Int): String {
        return if (start == end) {
            start.toString()
        } else {
            "$start->$end"
        }
    }
}