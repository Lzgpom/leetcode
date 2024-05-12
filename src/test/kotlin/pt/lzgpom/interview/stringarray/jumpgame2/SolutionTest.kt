package pt.lzgpom.interview.stringarray.jumpgame2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(2, 3, 1, 1, 4)
        val expected = 2

        // WHEN
        val result = solution.jump(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(2, 3, 0, 1, 4)
        val expected = 2

        // WHEN
        val result = solution.jump(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val nums = intArrayOf(0)
        val expected = 0

        // WHEN
        val result = solution.jump(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample4() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3)
        val expected = 2

        // WHEN
        val result = solution.jump(nums)

        // THEN
        assertEquals(expected, result)
    }
}