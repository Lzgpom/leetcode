package pt.lzgpom.interview.twopointers.issubsequence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "abc"
        val t = "ahbgdc"
        val expected = true

        // WHEN
        val result = solution.isSubsequence(s, t)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "axc"
        val t = "ahbgdc"
        val expected = false

        // WHEN
        val result = solution.isSubsequence(s, t)

        // THEN
        assertEquals(expected, result)
    }
}