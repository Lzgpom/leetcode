package pt.lzgpom.problems.p1910

import java.util.Stack

class Solution {
    fun removeOccurrences(s: String, part: String): String {
        val chars = Stack<Char>()

        for (char in s) {
            chars.push(char)
            removePartIfMatches(chars, part)
        }

        return chars.joinToString("")
    }

    private fun removePartIfMatches(chars: Stack<Char>, part: String) {
        if (chars.size < part.length) {
            return
        }

        val removed = Stack<Char>()
        for (i in part.lastIndex downTo 0) {
            val partChar = part[i]
            val char = chars.peek()

            if (char == partChar) {
                removed.push(char)
                chars.pop()
            } else {
                while (removed.isNotEmpty()) {
                    val removedChar = removed.pop()
                    chars.push(removedChar)
                }

                return
            }
        }
    }
}