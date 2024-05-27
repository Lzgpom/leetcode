package pt.lzgpom.interview.stack.validparentheses

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "()"

        val expected = true

        // WHEN
        val result = solution.isValid(s)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "()[]{}"

        val expected = true

        // WHEN
        val result = solution.isValid(s)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val s = "(]"

        val expected = false

        // WHEN
        val result = solution.isValid(s)

        // THEN
        assertEquals(expected, result)
    }
}