package pt.lzgpom.interview.binarysearch.searchinrotatedsortedarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()

    private class Input(val nums: IntArray, val target: Int)

    private val examples = listOf(
        Input(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0) to 4,
        Input(intArrayOf(7, 1, 2, 3, 4, 5, 6), 7) to 0,
        Input(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3) to -1,
        Input(intArrayOf(1), 0) to -1,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the index of ${input.target} in the array ${input.nums.contentToString()} should be $expected") {
                // WHEN
                val result = solution.search(input.nums, input.target)

                // THEN
                assertEquals(expected, result)
            }
        }
}