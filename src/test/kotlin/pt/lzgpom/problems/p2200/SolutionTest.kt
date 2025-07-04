package pt.lzgpom.problems.p2200

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(3, 4, 9, 1, 3, 9, 5)
        val key = 9
        val k = 1

        // WHEN
        val result = solution.findKDistantIndices(nums, key, k)

        // THEN
        assertEquals(listOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val key = 2
        val k = 2

        // WHEN
        val result = solution.findKDistantIndices(nums, key, k)

        // THEN
        assertEquals(listOf(0, 1, 2, 3, 4), result)
    }

}