package pt.lzgpom.interview.intervals.mergeintervals

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val intervals = arrayOf(
            intArrayOf(1,3),
            intArrayOf(2,6),
            intArrayOf(8,10),
            intArrayOf(15,18)
        )

        val expected = arrayOf(
            intArrayOf(1,6),
            intArrayOf(8,10),
            intArrayOf(15,18)
        )

        // WHEN
        val result = solution.merge(intervals)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val intervals = arrayOf(
            intArrayOf(1,4),
            intArrayOf(1,5)
        )

        val expected = arrayOf(
            intArrayOf(1,5)
        )

        // WHEN
        val result = solution.merge(intervals)

        // THEN
        assertArrayEquals(expected, result)
    }
}