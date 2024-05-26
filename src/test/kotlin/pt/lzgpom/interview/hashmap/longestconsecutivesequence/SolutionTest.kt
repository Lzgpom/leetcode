package pt.lzgpom.interview.hashmap.longestconsecutivesequence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(100, 4, 200, 1, 3, 2)

        val expected = 4

        // WHEN
        val result = solution.longestConsecutive(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)

        val expected = 9

        // WHEN
        val result = solution.longestConsecutive(nums)

        // THEN
        assertEquals(expected, result)
    }
}