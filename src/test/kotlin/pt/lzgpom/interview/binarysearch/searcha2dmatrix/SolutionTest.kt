package pt.lzgpom.interview.binarysearch.searcha2dmatrix

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty

class SolutionTest {
    private val solution = Solution()

    private class Input(val matrix: Array<IntArray>, val target: Int)

    private val examples = listOf(
        Input(
            arrayOf(
                intArrayOf(1, 3, 5, 7),
                intArrayOf(10, 11, 16, 20),
                intArrayOf(23, 30, 34, 60)
            ), 3
        ) to true,
        Input(
            arrayOf(
                intArrayOf(1, 3, 5, 7),
                intArrayOf(10, 11, 16, 20),
                intArrayOf(23, 30, 34, 60)
            ), 13
        ) to false,
        Input(
            arrayOf(
                intArrayOf(1),
            ), 2
        ) to false
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the number ${input.target} should ${expected.notOrEmpty()} be present in the matrix") {
                // WHEN
                val result = solution.searchMatrix(input.matrix, input.target)

                // THEN
                assertEquals(expected, result)
            }
        }
}