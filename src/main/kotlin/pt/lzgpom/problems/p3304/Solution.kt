package pt.lzgpom.problems.p3304

class Solution {
    fun kthCharacter(k: Int): Char {
        var word = "a"

        while (word.length < k) {
            val newPart = word.map { nextChar(it) }.joinToString("")
            word += newPart
        }

        return word[k - 1]
    }

    private fun nextChar(char: Char): Char {
        return when (char) {
            in 'a'..'y' -> return char + 1
            'z' -> return 'a'
            else -> char
        }
    }
}