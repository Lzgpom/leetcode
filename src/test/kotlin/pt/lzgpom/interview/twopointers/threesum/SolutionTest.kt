package pt.lzgpom.interview.twopointers.threesum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))

        // WHEN
        val result = solution.threeSum(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(0,1,1)
        val expected = listOf<List<Int>>()

        // WHEN
        val result = solution.threeSum(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val nums = intArrayOf(0,0,0)
        val expected = listOf(listOf(0,0,0))

        // WHEN
        val result = solution.threeSum(nums)

        // THEN
        assertEquals(expected, result)
    }
}