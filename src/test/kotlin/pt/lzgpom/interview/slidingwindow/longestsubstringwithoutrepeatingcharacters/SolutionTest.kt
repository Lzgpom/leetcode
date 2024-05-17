package pt.lzgpom.interview.slidingwindow.longestsubstringwithoutrepeatingcharacters

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "abcabcbb"
        val expected = 3

        // WHEN
        val result = solution.lengthOfLongestSubstring(s)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "bbbbb"
        val expected = 1

        // WHEN
        val result = solution.lengthOfLongestSubstring(s)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val s = "pwwkew"
        val expected = 3

        // WHEN
        val result = solution.lengthOfLongestSubstring(s)

        // THEN
        assertEquals(expected, result)
    }
}