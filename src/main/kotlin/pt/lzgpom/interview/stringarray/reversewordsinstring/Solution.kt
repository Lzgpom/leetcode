package pt.lzgpom.interview.stringarray.reversewordsinstring

class Solution {
    fun reverseWords(s: String): String {
        return s.split(' ').reversed()
            .filter { it.isNotBlank() }
            .joinToString(" ")
    }
}