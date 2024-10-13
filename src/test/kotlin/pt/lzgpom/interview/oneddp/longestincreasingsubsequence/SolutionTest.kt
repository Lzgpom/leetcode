package pt.lzgpom.interview.oneddp.longestincreasingsubsequence

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(10, 9, 2, 5, 3, 7, 101, 18) to 4,
        intArrayOf(0, 1, 0, 3, 2, 3) to 4,
        intArrayOf(7, 7, 7, 7, 7, 7, 7) to 1,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the longest subsequence of ${nums.contentToString()} should be of size $expected") {
                // WHEN
                val result = solution.lengthOfLIS(nums)

                // THEN
                assertEquals(expected, result)
            }
        }
}