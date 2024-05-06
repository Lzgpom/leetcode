package pt.lzgpom.interview.lengthoflastword

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var started = false
        var count = 0

        for (i in s.lastIndex downTo 0) {
            val char = s[i]
            if (!started && char != ' ') {
                started = true
                count++
            } else if (started && char == ' ') {
                return count
            } else if (char != ' '){
                count++
            }
        }

        return count
    }
}