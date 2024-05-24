package pt.lzgpom.interview.hashmap.twosum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        val expected = intArrayOf(0, 1)

        // WHEN
        val result = solution.twoSum(nums, target)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(3, 2, 4)
        val target = 6

        val expected = intArrayOf(1, 2)

        // WHEN
        val result = solution.twoSum(nums, target)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val nums = intArrayOf(3, 3)
        val target = 6

        val expected = intArrayOf(0, 1)

        // WHEN
        val result = solution.twoSum(nums, target)

        // THEN
        assertArrayEquals(expected, result)
    }
}