package pt.lzgpom.interview.heap.kthlargestelementinarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val nums: IntArray, val k: Int)

    private val solution = Solution()
    private val examples = listOf(
        // Input(intArrayOf(3, 2, 1, 5, 6, 4), 2) to 5,
        Input(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4) to 4,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the ${input.k}th largest number in the array ${input.nums.contentToString()} should be $expected") {
                // WHEN
                val result = solution.findKthLargest(input.nums, input.k)

                // THEN
                assertEquals(expected, result)
            }
        }
}