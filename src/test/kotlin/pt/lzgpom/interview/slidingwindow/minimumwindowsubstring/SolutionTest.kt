package pt.lzgpom.interview.slidingwindow.minimumwindowsubstring

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "ADOBECODEBANC"
        val t = "ABC"
        val expected = "BANC"

        // WHEN
        val result = solution.minWindow(s, t)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "a"
        val t = "a"
        val expected = "a"

        // WHEN
        val result = solution.minWindow(s, t)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val s = "a"
        val t = "aa"
        val expected = ""

        // WHEN
        val result = solution.minWindow(s, t)

        // THEN
        assertEquals(expected, result)
    }
}