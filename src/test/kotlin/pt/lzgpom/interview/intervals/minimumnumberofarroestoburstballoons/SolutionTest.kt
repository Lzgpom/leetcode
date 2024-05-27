package pt.lzgpom.interview.intervals.minimumnumberofarroestoburstballoons

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val points = arrayOf(
            intArrayOf(10, 16),
            intArrayOf(2, 8),
            intArrayOf(1, 6),
            intArrayOf(7, 12)
        )

        val expected = 2

        // WHEN
        val result = solution.findMinArrowShots(points)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val points = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4),
            intArrayOf(5, 6),
            intArrayOf(7, 8)
        )

        val expected = 4

        // WHEN
        val result = solution.findMinArrowShots(points)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val points = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 4),
            intArrayOf(4, 5)
        )

        val expected = 2

        // WHEN
        val result = solution.findMinArrowShots(points)

        // THEN
        assertEquals(expected, result)
    }
}