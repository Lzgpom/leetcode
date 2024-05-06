package pt.lzgpom.interview.integertoroman

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVE
        val input = 3749
        val expected = "MMMDCCXLIX"

        // WHEN
        val result = solution.intToRoman(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVE
        val input = 58
        val expected = "LVIII"

        // WHEN
        val result = solution.intToRoman(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVE
        val input = 1994
        val expected = "MCMXCIV"

        // WHEN
        val result = solution.intToRoman(input)

        // THEN
        assertEquals(expected, result)
    }

}