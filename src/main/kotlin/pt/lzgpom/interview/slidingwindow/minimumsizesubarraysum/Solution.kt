package pt.lzgpom.interview.slidingwindow.minimumsizesubarraysum

import kotlin.math.min

class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var left = 0
        var right = 0

        var currentBest = nums.size + 1

        while (right < nums.size) {
            sum += nums[right]

            while (sum >= target) {
                currentBest = min(currentBest, right - left + 1)
                sum -= nums[left]
                left++
            }

            right++
        }

        return if (currentBest > nums.size) {
            0
        } else {
            currentBest
        }
    }
}