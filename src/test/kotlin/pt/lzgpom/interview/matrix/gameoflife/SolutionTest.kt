package pt.lzgpom.interview.matrix.gameoflife

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        val board = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(0, 0, 0)
        )

        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 1, 0)
        )

        // WHEN
        solution.gameOfLife(board)

        // THEN
        assertArrayEquals(expected, board)
    }

    @Test
    fun testWithExample2() {
        val board = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 0),
        )

        val expected = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1),
        )

        // WHEN
        solution.gameOfLife(board)

        // THEN
        assertArrayEquals(expected, board)
    }
}