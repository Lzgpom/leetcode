package pt.lzgpom.interview.math.factorialtrailingzeroes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        3 to 0,
        5 to 1,
        0 to 0
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (n, expected) ->
            dynamicTest("the factorial of $n should have $expected trailing zeros") {
                // WHEN
                val result = solution.trailingZeroes(n)

                // THEN
                assertEquals(expected, result)
            }
        }
}