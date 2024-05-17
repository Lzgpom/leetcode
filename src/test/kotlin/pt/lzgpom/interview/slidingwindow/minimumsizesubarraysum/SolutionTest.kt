package pt.lzgpom.interview.slidingwindow.minimumsizesubarraysum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(2, 3, 1, 2, 4, 3)
        val target = 7
        val expected = 2

        // WHEN
        val result = solution.minSubArrayLen(target, nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(1, 4, 4)
        val target = 4
        val expected = 1

        // WHEN
        val result = solution.minSubArrayLen(target, nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        val target = 11
        val expected = 0

        // WHEN
        val result = solution.minSubArrayLen(target, nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample4() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val target = 11
        val expected = 3

        // WHEN
        val result = solution.minSubArrayLen(target, nums)

        // THEN
        assertEquals(expected, result)
    }
}