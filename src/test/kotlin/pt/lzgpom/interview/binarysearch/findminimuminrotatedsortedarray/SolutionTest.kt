package pt.lzgpom.interview.binarysearch.findminimuminrotatedsortedarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(3, 4, 5, 1, 2) to 1,
        intArrayOf(4, 5, 6, 7, 0, 1, 2) to 0,
        intArrayOf(11, 13, 15, 17) to 11,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the minimum value of the array ${nums.contentToString()} should be $expected") {
                // WHEN
                val result = solution.findMin(nums)

                // THEN
                assertEquals(expected, result)
            }
        }
}