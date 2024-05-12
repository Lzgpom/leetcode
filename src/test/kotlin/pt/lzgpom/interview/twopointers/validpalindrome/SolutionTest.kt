package pt.lzgpom.interview.twopointers.validpalindrome

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val input = "A man, a plan, a canal: Panama"
        val expected = true

        // WHEN
        val result = solution.isPalindrome(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val input = "race a car"
        val expected = false

        // WHEN
        val result = solution.isPalindrome(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val input = " "
        val expected = true

        // WHEN
        val result = solution.isPalindrome(input)

        // THEN
        assertEquals(expected, result)
    }
}