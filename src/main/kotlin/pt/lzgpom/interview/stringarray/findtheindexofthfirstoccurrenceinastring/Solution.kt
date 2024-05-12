package pt.lzgpom.interview.stringarray.findtheindexofthfirstoccurrenceinastring

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val lastValidIndex = haystack.length - needle.length

        for (i in 0..lastValidIndex) {
            if (isSameAsNeedle(haystack, i, needle)) {
                return i
            }
        }

        return -1
    }

    private fun isSameAsNeedle(haystack: String, start: Int, needle: String): Boolean {
        for (i in needle.indices) {
            if (needle[i] != haystack[start + i]) {
                return false
            }
        }

        return true
    }
}