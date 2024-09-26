package pt.lzgpom.interview.math.pow

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val x: Double, val n: Int)

    private val solution = Solution()
    private val examples = listOf(
        Input(2.0, 10) to 1024.0,
        Input(2.1, 3) to 9.261000000000001,
        Input(2.0, -2) to 0.25,
        Input(2.0, -2147483648) to 0.00000,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the ${input.n} powered to ${input.x} should be $expected") {
                // WHEN
                val result = solution.myPow(input.x, input.n)

                // THEN
                assertEquals(expected, result)
            }
        }
}