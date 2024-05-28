package pt.lzgpom.interview.stack.evaluatereservepolishnotation

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        arrayOf("2", "1", "+", "3", "*") to 9,
        arrayOf("4", "13", "5", "/", "+") to 6,
        arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+") to 22
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (tokens, expected) ->
            dynamicTest("the operation ${tokens.joinToString(" ")} in RPN should get $expected") {
                // WHEN
                val result = solution.evalRPN(tokens)

                // THEN
                assertEquals(expected, result)
            }
        }
}