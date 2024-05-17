package pt.lzgpom.interview.slidingwindow.longestsubstringwithoutrepeatingcharacters

import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charsInSubString = HashSet<Char>()

        var left = 0
        var right = 0

        var currentBest = 0

        while (right < s.length) {
            if (!charsInSubString.contains(s[right])) {
                charsInSubString.add(s[right])
                currentBest = max(currentBest, charsInSubString.size)
                right++
            } else {
                while (left < right && charsInSubString.contains(s[right])) {
                    charsInSubString.remove(s[left])
                    left++
                }
            }

        }

        return currentBest
    }
}