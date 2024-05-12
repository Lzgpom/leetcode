package pt.lzgpom.interview.stringarray.trappingrainwater

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val expected = 6

        // WHEN
        val result = solution.trap(nums1)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums1 = intArrayOf(4, 2, 0, 3, 2, 5)
        val expected = 9

        // WHEN
        val result = solution.trap(nums1)

        // THEN
        assertEquals(expected, result)
    }
}