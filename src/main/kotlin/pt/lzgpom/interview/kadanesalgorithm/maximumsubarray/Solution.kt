package pt.lzgpom.interview.kadanesalgorithm.maximumsubarray

import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var current = 0

        for (num in nums) {
            current += num
            maxSum = max(maxSum, current)

            if (current < 0) {
                current = 0
            }
        }

        return maxSum
    }
}