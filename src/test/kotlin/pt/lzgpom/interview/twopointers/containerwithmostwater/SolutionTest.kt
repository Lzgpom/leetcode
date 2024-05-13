package pt.lzgpom.interview.twopointers.containerwithmostwater

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        val expected = 49

        // WHEN
        val result = solution.maxArea(height)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val height = intArrayOf(1, 1)
        val expected = 1

        // WHEN
        val result = solution.maxArea(height)

        // THEN
        assertEquals(expected, result)
    }
}