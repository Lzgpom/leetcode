package pt.lzgpom.interview.math.plusone

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(1, 2, 3) to intArrayOf(1, 2, 4),
        intArrayOf(4, 3, 2, 1) to intArrayOf(4, 3, 2, 2),
        intArrayOf(9) to intArrayOf(1, 0)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (digits, expected) ->
            dynamicTest("the number ${digits.contentToString()} plus one should be ${expected.contentToString()}") {
                // WHEN
                val result = solution.plusOne(digits.clone())

                // THEN
                assertArrayEquals(expected, result)
            }
        }
}