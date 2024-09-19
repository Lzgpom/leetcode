package pt.lzgpom.interview.binarysearch.medianoftwosortedarrays

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val nums1: IntArray, val nums2: IntArray)

    private val solution = Solution()
    private val examples = listOf(
        Input(intArrayOf(1, 3), intArrayOf(2)) to 2.0,
        Input(intArrayOf(1, 2), intArrayOf(3, 4)) to 2.5,
        Input(intArrayOf(1, 5, 6, 7), intArrayOf(2, 3, 4)) to 4.0,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the median of the arrays ${input.nums1.contentToString()} and ${input.nums2.contentToString()} should be $expected") {
                // WHEN
                val result = solution.findMedianSortedArrays(input.nums1, input.nums2)

                // THEN
                assertEquals(expected, result)
            }
        }
}