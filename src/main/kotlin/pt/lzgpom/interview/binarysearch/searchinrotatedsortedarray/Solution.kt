package pt.lzgpom.interview.binarysearch.searchinrotatedsortedarray

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val middle = left + ((right - left) / 2)

            if (nums[left] <= nums[middle]) {
                if (target in nums[left]..nums[middle]) {
                    right = middle
                } else {
                    left = middle + 1
                }
            } else {
                if (target in nums[middle]..nums[right]) {
                    left = middle
                } else {
                    right = middle - 1
                }
            }
        }

        return if (nums[left] == target) {
            left
        } else {
            -1
        }
    }
}