package pt.lzgpom.problems.p2311

class Solution {
    fun longestSubsequence(s: String, k: Int): Int {
        var result = 0
        var sum = 0
        var hasReachedValue = false
        for (i in s.lastIndex downTo 0) {
            when (s[i]) {
                '0' -> result++
                '1' -> if (!hasReachedValue) {
                    if (result >= 31) {
                        hasReachedValue = true
                        continue
                    }
                    val bitValue = 1 shl result
                    sum += bitValue

                    if (sum > k) {
                        hasReachedValue = true
                    } else {
                        result++
                    }
                }
            }
        }

        return result
    }
}