package pt.lzgpom.interview.binarysearch.findfirstandlastpositionofelementinsortedarray

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val index = getAnIndexOfArray(nums, target) ?: return intArrayOf(-1, -1)

        return intArrayOf(
            getMinIndexOfTarget(nums, target, index),
            getMaxIndexOfTarget(nums, target, index)
        )
    }

    private fun getAnIndexOfArray(nums: IntArray, target: Int): Int? {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val middle = left + ((right - left) / 2)

            if (nums[middle] == target) {
                return middle
            }
            if (nums[middle] < target) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }

        return null
    }

    private fun getMinIndexOfTarget(nums: IntArray, target: Int, end: Int): Int {
        var left = 0
        var right = end

        while (left < right) {
            val middle = left + ((right - left) / 2)

            if (target in nums[left] ..nums[middle]) {
                right = middle
            } else {
                left = middle + 1
            }
        }

        return left
    }

    private fun getMaxIndexOfTarget(nums: IntArray, target: Int, start: Int): Int {
        var left = start
        var right = nums.lastIndex

        while (left < right) {
            val middle = right - ((right - left) / 2)

            if (target in nums[middle] ..nums[right]) {
                left = middle
            } else {
                right = middle - 1
            }
        }

        return left
    }
}