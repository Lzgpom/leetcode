package pt.lzgpom.interview.intervals.insertinterval

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val intervals = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(6, 9)
        )

        val newInterval = intArrayOf(2, 5)

        val expected = arrayOf(
            intArrayOf(1, 5),
            intArrayOf(6, 9)
        )

        // WHEN
        val result = solution.insert(intervals, newInterval)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val intervals = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 5),
            intArrayOf(6, 7),
            intArrayOf(8, 10),
            intArrayOf(12, 16)
        )

        val newInterval = intArrayOf(4, 8)

        val expected = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 10),
            intArrayOf(12, 16)
        )

        // WHEN
        val result = solution.insert(intervals, newInterval)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val intervals = arrayOf(
            intArrayOf(1, 5)
        )

        val newInterval = intArrayOf(0, 0)

        val expected = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(1, 5)
        )

        // WHEN
        val result = solution.insert(intervals, newInterval)

        // THEN
        assertArrayEquals(expected, result)
    }
}