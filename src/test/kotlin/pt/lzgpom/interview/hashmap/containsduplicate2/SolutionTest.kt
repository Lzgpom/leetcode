package pt.lzgpom.interview.hashmap.containsduplicate2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 1)
        val k = 3

        val expected = true

        // WHEN
        val result = solution.containsNearbyDuplicate(nums, k)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(1, 0, 1, 1)
        val k = 1

        val expected = true

        // WHEN
        val result = solution.containsNearbyDuplicate(nums, k)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 1, 2, 3)
        val k = 2

        val expected = true

        // WHEN
        val result = solution.containsNearbyDuplicate(nums, k)

        // THEN
        assertEquals(expected, result)
    }
}