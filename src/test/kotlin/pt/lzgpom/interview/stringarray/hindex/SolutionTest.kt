package pt.lzgpom.interview.stringarray.hindex

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(3, 0, 6, 1, 5)
        val expected = 3

        // WHEN
        val result = solution.hIndex(nums1)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums1 = intArrayOf(1, 3, 1)
        val expected = 1

        // WHEN
        val result = solution.hIndex(nums1)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val nums1 = intArrayOf(11, 15)
        val expected = 2

        // WHEN
        val result = solution.hIndex(nums1)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample4() {
        // GIVEN
        val nums1 = intArrayOf(4, 4, 0, 0)
        val expected = 2

        // WHEN
        val result = solution.hIndex(nums1)

        // THEN
        assertEquals(expected, result)
    }
}