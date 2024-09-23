package pt.lzgpom.interview.bitmanipulation.numberofonebits

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        11 to 3,
        128 to 1,
        2147483645 to 30
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (n, expected) ->
            dynamicTest("the integer $n should have $expected set bits") {
                // WHEN
                val result = solution.hammingWeight(n)

                // THEN
                assertEquals(expected, result)
            }
        }
}