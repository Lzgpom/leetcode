package pt.lzgpom.interview.stringarray.romantointeger

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val input = "III"
        val expected = 3

        // WHEN
        val result = solution.romanToInt(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val input = "LVIII"
        val expected = 58

        // WHEN
        val result = solution.romanToInt(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val input = "MCMXCIV"
        val expected = 1994

        // WHEN
        val result = solution.romanToInt(input)

        // THEN
        assertEquals(expected, result)
    }
}