package pt.lzgpom.interview.hashmap.longestconsecutivesequence

import kotlin.math.max

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numsSet = nums.toHashSet()

        var best = 0
        for (num in numsSet) {
            if (!numsSet.contains(num - 1)) {
                var current = 1
                var currentNum = num + 1

                while (numsSet.contains(currentNum)) {
                    currentNum ++
                    current++
                }

                best = max(best, current)
            }
        }

        return best
    }
}