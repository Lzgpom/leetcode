package pt.lzgpom.interview.kadanesalgorithm.maximumsubarray

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) to 6,
        intArrayOf(1) to 1,
        intArrayOf(5, 4, -1, 7, 8) to 23
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the maximum sum of the subarray of the ${nums.contentToString()} should $expected") {
                // WHEN
                val result = solution.maxSubArray(nums)

                // THEN
                assertEquals(expected, result)
            }
        }
}