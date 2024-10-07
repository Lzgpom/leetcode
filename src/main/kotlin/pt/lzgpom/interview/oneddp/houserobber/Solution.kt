package pt.lzgpom.interview.oneddp.houserobber

import kotlin.math.max

class Solution {
    fun rob(nums: IntArray): Int {
        var prev1 = 0
        var prev2 = 0

        for (num in nums) {
            val tmp = prev1
            prev1 = max(prev2 + num, prev1)
            prev2 = tmp

        }
        return prev1
    }
}