package pt.lzgpom.interview.binarysearch.findpeakelement

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(1, 2, 3, 1) to setOf(2),
        intArrayOf(1, 2, 1, 3, 5, 6, 4) to setOf(1, 5),
        // intArrayOf(1, 3, 2, 4, 5, 6, 7) to setOf(1), didnt quite understand why this was not a possibility...
        intArrayOf(1) to setOf(0),
        intArrayOf(1, 2, 3, 4) to setOf(3),
        intArrayOf(6,5,4,3,2,3,2) to setOf(0, 5),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the index of the peak in the array ${nums.contentToString()} should be either $expected") {
                // WHEN
                val result = solution.findPeakElement(nums)

                // THEN
                assertTrue(expected.contains(result))
            }
        }
}