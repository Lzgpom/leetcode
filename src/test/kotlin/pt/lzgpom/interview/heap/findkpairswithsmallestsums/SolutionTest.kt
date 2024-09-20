package pt.lzgpom.interview.heap.findkpairswithsmallestsums

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val nums1: IntArray, val nums2: IntArray, val k: Int)

    private val solution = Solution()
    private val examples = listOf(
        Input(intArrayOf(1, 7, 11), intArrayOf(2, 4, 6), 3) to listOf(listOf(1, 2), listOf(1, 4), listOf(1, 6)),
        Input(intArrayOf(1, 1, 2), intArrayOf(1, 2, 3), 2) to listOf(listOf(1, 1), listOf(1, 1)),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the smallest ${input.k} pairs in the arrays ${input.nums1.contentToString()} and ${input.nums2.contentToString()} should be $expected") {
                // WHEN
                val result = solution.kSmallestPairs(input.nums1, input.nums2, input.k)

                // THEN
                assertEquals(expected.size, result.size)
                assertTrue(result.containsAll(expected))
            }
        }
}