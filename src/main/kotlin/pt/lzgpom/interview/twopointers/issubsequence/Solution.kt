package pt.lzgpom.interview.twopointers.issubsequence

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var sIndex = 0

        for (char in t) {
            if (sIndex >= s.length) {
                return true
            }

            if (char == s[sIndex]) {
                sIndex++
            }
        }

        return sIndex >= s.length
    }
}