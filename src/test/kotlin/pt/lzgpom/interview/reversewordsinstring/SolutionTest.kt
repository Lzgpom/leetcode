package pt.lzgpom.interview.reversewordsinstring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val input = "the sky is blue"
        val expected = "blue is sky the"

        // WHEN
        val result = solution.reverseWords(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val input = "  hello world  "
        val expected = "world hello"

        // WHEN
        val result = solution.reverseWords(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val input = "a good   example"
        val expected = "example good a"

        // WHEN
        val result = solution.reverseWords(input)

        // THEN
        assertEquals(expected, result)
    }
}