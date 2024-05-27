package pt.lzgpom.interview.stack.validparentheses

import java.util.Stack

class Solution {
    fun isValid(s: String): Boolean {
        val parentheses = Stack<Char>()

        for (char in s) {
            if (OPEN_TO_CLOSE_PARENTHESES.contains(char)) {
                parentheses.push(char)
            } else {
                if(parentheses.isEmpty()) {
                    return false
                }

                val expectedParentheses = OPEN_TO_CLOSE_PARENTHESES[parentheses.pop()]
                if (char != expectedParentheses) {
                    return false
                }
            }
        }

        return parentheses.isEmpty()
    }

    companion object {
        private val OPEN_TO_CLOSE_PARENTHESES = mapOf(
            '(' to ')',
            '{' to '}',
            '[' to ']'
        )
    }
}