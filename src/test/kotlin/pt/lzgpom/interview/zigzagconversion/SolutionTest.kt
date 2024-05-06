package pt.lzgpom.interview.zigzagconversion

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "PAYPALISHIRING"
        val numRows = 3
        val expected = "PAHNAPLSIIGYIR"

        // WHEN
        val result = solution.convert(s, numRows)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "PAYPALISHIRING"
        val numRows = 4
        val expected = "PINALSIGYAHRPI"

        // WHEN
        val result = solution.convert(s, numRows)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val s = "A"
        val numRows = 1
        val expected = "A"

        // WHEN
        val result = solution.convert(s, numRows)

        // THEN
        assertEquals(expected, result)
    }
}