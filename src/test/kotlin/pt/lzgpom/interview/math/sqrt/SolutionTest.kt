package pt.lzgpom.interview.math.sqrt

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        4 to 2,
        8 to 2,
        2147483647 to 46340
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (x, expected) ->
            dynamicTest("the sqrt of $x should be $expected") {
                // WHEN
                val result = solution.mySqrt(x)

                // THEN
                assertEquals(expected, result)
            }
        }
}