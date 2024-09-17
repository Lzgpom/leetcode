package pt.lzgpom.interview.binarysearch.findminimuminrotatedsortedarray

class Solution {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val middle = left + ((right - left) / 2)

            if (nums[middle] > nums[right]) {
                left = middle + 1
            } else {
                right = middle
            }
        }

        return nums[left]
    }
}