package pt.lzgpom.interview.stack.evaluatereservepolishnotation

import java.util.*

class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val values = Stack<Int>()

        for (token in tokens) {
            if (OPERATOR_FUNCTION.contains(token)) {
                val value1 = values.pop()
                val value2 = values.pop()
                values.push(OPERATOR_FUNCTION[token]!!.invoke(value2, value1))
            } else {
                values.push(token.toInt())
            }
        }

        return values.pop()
    }

    companion object {
        private val OPERATOR_FUNCTION = mapOf<String, (Int, Int) -> Int>(
            "+" to Int::plus,
            "-" to Int::minus,
            "*" to Int::times,
            "/" to Int::div
        )
    }
}