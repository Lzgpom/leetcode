package pt.lzgpom.interview.stack.basiccalculator

import java.util.*

typealias IntOperation = (Int, Int) -> Int

// Now that I think better a stack can also be like recursion.
class Solution {
    fun calculate(s: String): Int {
        val previousOperations = Stack<Pair<Int, IntOperation>>()

        var previousValue = 0
        var previousOperation: IntOperation = Int::plus

        var i = 0
        while (i < s.length) {
            val char = s[i]

            when {
                char.isDigit() -> {
                    val (value, end) = numberInString(s, i)
                    i = end

                    previousValue = previousOperation.invoke(previousValue, value)
                    previousOperation = DEFAULT_OPERATION
                }

                char == '(' -> {
                    previousOperations.push(Pair(previousValue, previousOperation))

                    previousValue = 0
                    previousOperation = DEFAULT_OPERATION
                }

                char == ')' -> {
                    val (value, operation) = previousOperations.pop()
                    previousValue = operation.invoke(value, previousValue)
                }

                OPERATOR_FUNCTION.contains(char) -> {
                    previousOperation = OPERATOR_FUNCTION[char]!!
                }
            }

            i++
        }

        return previousValue
    }



    private fun numberInString(s: String, startIndex: Int): Pair<Int, Int> {
        var endIndex = startIndex + 1

        while (endIndex < s.length && s[endIndex].isDigit()) {
            endIndex++
        }

        return Pair(s.substring(startIndex, endIndex).toInt(), endIndex - 1)
    }

    companion object {
        private val DEFAULT_OPERATION: IntOperation = { _: Int, value: Int -> value }

        private val OPERATOR_FUNCTION = mapOf<Char, IntOperation>(
            '+' to Int::plus,
            '-' to Int::minus,
            '*' to Int::times,
            '/' to Int::div
        )
    }
}