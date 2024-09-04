package pt.lzgpom.interview.backtracking.generateparentheses

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        3 to listOf("((()))", "(()())", "(())()", "()(())", "()()()"),
        2 to listOf("(())", "()()"),
        1 to listOf("()")
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (n, expected) ->
            dynamicTest("the combinations of $n parentheses set should be $expected") {
                // WHEN
                val result = solution.generateParenthesis(n)
                println(result)

                // THEN
                assertEquals(expected.size, result.size)
                assertTrue(result.containsAll(expected))
            }
        }
}