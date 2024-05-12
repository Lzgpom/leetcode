package pt.lzgpom.interview.findtheindexofthfirstoccurrenceinastring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val haystack = "sadbutsad"
        val needle = "sad"
        val expected = 0

        // WHEN
        val result = solution.strStr(haystack, needle)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val haystack = "leetcode"
        val needle = "leeto"
        val expected = -1

        // WHEN
        val result = solution.strStr(haystack, needle)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val haystack = "a"
        val needle = "a"
        val expected = 0

        // WHEN
        val result = solution.strStr(haystack, needle)

        // THEN
        assertEquals(expected, result)
    }
}
