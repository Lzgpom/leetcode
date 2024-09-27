package pt.lzgpom.interview.oneddp.climbingstairs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        2 to 2,
        3 to 3,
        4 to 5,
        5 to 8,
        6 to 13,
        7 to 21,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (n, expected) ->
            dynamicTest("there should be $expected ways to climb $n steps.") {
                // WHEN
                val result = solution.climbStairs(n)

                // THEN
                assertEquals(expected, result)
            }
        }
}