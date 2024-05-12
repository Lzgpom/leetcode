package pt.lzgpom.interview.twopointers.validpalindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex

        while (left < right) {
            while (left < s.lastIndex && !s[left].isLetterOrDigit()) {
                left++
            }

            while (right > 0 && !s[right].isLetterOrDigit()) {
                right--
            }

            if (left >= right) {
                return true
            }

            if (s[left].lowercase() != s[right].lowercase()) {
                return false
            }

            left++
            right--
        }

        return true
    }
}