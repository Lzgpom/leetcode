package pt.lzgpom.interview.stack.basiccalculator

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        "1 + 1" to 2,
        " 2-1 +2 " to 3,
        "(1+(4+5+2)-3)+(6+8)" to 23,
        "2147483647" to 2147483647
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (s, expected) ->
            dynamicTest("the result of $s should be $expected") {
                // WHEN
                val result = solution.calculate(s)

                // THEN
                assertEquals(expected, result)
            }
        }
}