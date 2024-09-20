package pt.lzgpom.interview.bitmanipulation.addbinary

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val a: String, val b: String)

    private val solution = Solution()
    private val examples = listOf(
        Input("11", "1") to "100",
        Input("1010", "1011") to "10101"
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the sum of the binary number ${input.a} and ${input.b} should be $expected") {
                // WHEN
                val result = solution.addBinary(input.a, input.b)

                // THEN
                assertEquals(expected, result)
            }
        }
}