package pt.lzgpom.interview.twopointers.twosum2sorted

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val numbers = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(1, 2)

        // WHEN
        val result = solution.twoSum(numbers, target)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val numbers = intArrayOf(2, 3, 4)
        val target = 6
        val expected = intArrayOf(1, 3)

        // WHEN
        val result = solution.twoSum(numbers, target)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val numbers = intArrayOf(-1,0)
        val target = -1
        val expected = intArrayOf(1, 2)

        // WHEN
        val result = solution.twoSum(numbers, target)

        // THEN
        assertArrayEquals(expected, result)
    }
}