package pt.lzgpom.interview.oneddp.houserobber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(1, 2, 3, 1) to 4,
        intArrayOf(2, 7, 9, 3, 1) to 12,
        intArrayOf(4, 1, 1, 4) to 8,
        intArrayOf(1, 7, 9, 4) to 11,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the max the robber can steal should be $expected in the houses ${nums.contentToString()}") {
                // WHEN
                val result = solution.rob(nums)

                // THEN
                assertEquals(expected, result)
            }
        }
}