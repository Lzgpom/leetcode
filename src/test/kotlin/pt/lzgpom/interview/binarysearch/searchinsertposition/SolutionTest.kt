package pt.lzgpom.interview.binarysearch.searchinsertposition

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()

    private class Input(val nums: IntArray, val target: Int)

    private val examples = listOf(
        // Input(intArrayOf(1, 3, 5, 6), 5) to 2,
        // Input(intArrayOf(1, 3, 5, 6), 2) to 1,
        // Input(intArrayOf(1, 3, 5, 6), 7) to 4,
        // Input(intArrayOf(1, 3, 5, 6), 0) to 0,
        Input(intArrayOf(1, 3), 0) to 0
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the index of ${input.target} in ${input.nums.contentToString()} should be $expected") {
                // WHEN
                val result = solution.searchInsert(input.nums, input.target)

                // THEN
                assertEquals(expected, result)
            }
        }

    @Test
    fun test() {
        println(1 / 2)
    }
}