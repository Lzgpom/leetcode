package pt.lzgpom.problems.p2200

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        val result = mutableListOf<Int>()
        var maxPreviousIndex = 0

        for (i in nums.indices) {
            if (nums[i] == key) {
                val minK = max(maxPreviousIndex, i - k)
                val maxK = min(nums.lastIndex, i + k)
                result.addAll(minK..maxK)

                if (maxK == nums.lastIndex) {
                    return result
                }

                maxPreviousIndex = maxK + 1
            }
        }

        return result
    }
}