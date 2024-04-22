package pt.lzgpom.interview.jumpgame

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(2,3,1,1,4)
        val expected = true

        // WHEN
        val result = solution.canJump(nums1)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums1 = intArrayOf(3,2,1,0,4)
        val expected = false

        // WHEN
        val result = solution.canJump(nums1)

        // THEN
        assertEquals(expected, result)
    }
}