package pt.lzgpom.interview.binarysearch.findpeakelement

class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var start = 0
        var end = nums.lastIndex

        while (start < end) {
            val middle = start + (end - start) / 2

            if (nums[middle] < nums[middle + 1]) {
                start = middle + 1
            } else {
                end = middle
            }
        }

        return start
    }
}