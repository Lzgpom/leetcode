package pt.lzgpom.interview.matrix.setmatrixzeroes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val matrix = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        )

        val expected = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
        )

        // WHEN
        solution.setZeroes(matrix)

        // THEN
        assertArrayEquals(matrix, expected)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val matrix = arrayOf(
            intArrayOf(0, 1, 2, 0),
            intArrayOf(3, 4, 5, 2),
            intArrayOf(1, 3, 1, 5),
        )

        val expected = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(0, 4, 5, 0),
            intArrayOf(0, 3, 1, 0),
        )

        // WHEN
        solution.setZeroes(matrix)

        // THEN
        assertArrayEquals(matrix, expected)
    }
}