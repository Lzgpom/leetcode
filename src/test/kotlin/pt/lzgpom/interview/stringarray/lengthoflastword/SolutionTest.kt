package pt.lzgpom.interview.stringarray.lengthoflastword

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val input = "Hello World"
        val expected = 5

        // WHEN
        val result = solution.lengthOfLastWord(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val input = "   fly me   to   the moon  "
        val expected = 4

        // WHEN
        val result = solution.lengthOfLastWord(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val input = "luffy is still joyboy"
        val expected = 6

        // WHEN
        val result = solution.lengthOfLastWord(input)

        // THEN
        assertEquals(expected, result)
    }
}