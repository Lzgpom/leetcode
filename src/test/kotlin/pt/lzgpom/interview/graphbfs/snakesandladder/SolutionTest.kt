package pt.lzgpom.interview.graphbfs.snakesandladder

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    private val examples = listOf(
        arrayOf(
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, 35, -1, -1, 13, -1),
            intArrayOf(-1, -1, -1, -1, -1, -1),
            intArrayOf(-1, 15, -1, -1, -1, -1),
        ) to 4,
        arrayOf(
            intArrayOf(-1, -1),
            intArrayOf(-1, 3),
        ) to 1,
        arrayOf(
            intArrayOf(-1, -1, -1),
            intArrayOf(-1, 9, 8),
            intArrayOf(-1, 8, 9),
        ) to 1,
        arrayOf(
            intArrayOf(-1, -1, 30, 14, 15, -1),
            intArrayOf(23, 9, -1, -1, -1, 9),
            intArrayOf(12, 5, 7, 24, -1, 30),
            intArrayOf(10, -1, -1, -1, 25, 17),
            intArrayOf(32, -1, 28, -1, -1, 32),
            intArrayOf(-1, -1, 23, -1, 13, 19),
        ) to 2
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (board, expected) ->
            dynamicTest("it should be completed in $expected moves") {
                // WHEN
                val result = solution.snakesAndLadders(board)

                // THEN
                assertEquals(expected, result)
            }
        }
}