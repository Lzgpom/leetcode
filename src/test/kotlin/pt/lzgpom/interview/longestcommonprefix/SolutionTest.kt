package pt.lzgpom.interview.longestcommonprefix

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val input = arrayOf("flower","flow","flight")
        val expected = "fl"

        // WHEN
        val result = solution.longestCommonPrefix(input)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val input = arrayOf("dog","racecar","car")
        val expected = ""

        // WHEN
        val result = solution.longestCommonPrefix(input)

        // THEN
        assertEquals(expected, result)
    }
}