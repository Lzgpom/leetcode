package pt.lzgpom.interview.binarysearch.findfirstandlastpositionofelementinsortedarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val nums: IntArray, val target: Int)

    private val solution = Solution()
    private val examples = listOf(
        Input(intArrayOf(5, 7, 7, 8, 8, 10), 8) to intArrayOf(3, 4),
        Input(intArrayOf(5, 7, 7, 8, 8, 10), 6) to intArrayOf(-1, -1),
        Input(intArrayOf(), 0) to intArrayOf(-1, -1),
        Input(intArrayOf(1), 1) to intArrayOf(0, 0),
        Input(intArrayOf(2, 2), 2) to intArrayOf(0, 1),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest(
                "the first and last position of ${input.target} in the " +
                        "array ${input.nums.contentToString()} should be ${expected.contentToString()}"
            ) {
                // WHEN
                val result = solution.searchRange(input.nums, input.target)

                // THEN
                assertArrayEquals(expected, result)
            }
        }
}