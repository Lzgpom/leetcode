package pt.lzgpom.interview.oneddp.longestincreasingsubsequence

import kotlin.math.max

class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val sizeOfSubString = IntArray(nums.size) { 1 }

        for (i in nums.indices) {
            val current = nums[i]

            for (j in 0 .. i) {
                val previous = nums[j]

                if (current > previous) {
                    sizeOfSubString[i] = max(sizeOfSubString[i], sizeOfSubString[j] + 1)
                }
            }
        }

        return sizeOfSubString.max()
    }
}