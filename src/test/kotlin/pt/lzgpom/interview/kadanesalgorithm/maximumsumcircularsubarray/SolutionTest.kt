package pt.lzgpom.interview.kadanesalgorithm.maximumsumcircularsubarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(1, -2, 3, -2) to 3,
        intArrayOf(5, -3, 5) to 10,
        intArrayOf(-3, -2, -3) to -2
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the maximum sum of the subarray of the circular array ${nums.contentToString()} should $expected") {
                // WHEN
                val result = solution.maxSubarraySumCircular(nums)

                // THEN
                assertEquals(expected, result)
            }
        }
}