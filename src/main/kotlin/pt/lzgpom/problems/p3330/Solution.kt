package pt.lzgpom.problems.p3330

class Solution {
    fun possibleStringCount(word: String): Int {
        var result = 1

        for (i in 1..word.lastIndex) {
            if (word[i] == word[i - 1]) {
                result++
            }
        }

        return result
    }
}