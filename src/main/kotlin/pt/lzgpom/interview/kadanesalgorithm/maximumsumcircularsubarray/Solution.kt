package pt.lzgpom.interview.kadanesalgorithm.maximumsumcircularsubarray

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var maxSum = nums[0]
        var minSum = nums[0]
        var currentMax = 0
        var currentMin = 0
        var total = 0

        for (num in nums) {
            total += num
            currentMax = max(currentMax + num, num)
            maxSum = max(currentMax, maxSum)
            currentMin = min(currentMin + num, num)
            minSum = min(currentMin, minSum)
        }

        return if (maxSum < 0) {
            maxSum
        } else {
            max(maxSum, total - minSum)
        }
    }
}