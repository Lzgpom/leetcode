package pt.lzgpom.problems.p2616

class Solution {
    fun minimizeMax(nums: IntArray, p: Int): Int {
        nums.sort()

        var left = 0
        var right = nums.last() - nums.first()

        while (left < right) {
            val mid = left + (right - left) / 2

            if (countPairsWithThreshold(nums, mid) >= p) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }

    private fun countPairsWithThreshold(nums: IntArray, threshold: Int): Int {
        var count = 0

        var i = 0
        while (i < nums.lastIndex) {
            if (nums[i + 1] - nums[i] <= threshold) {
                count++
                i++
            }

            i++
        }

        return count
    }
}