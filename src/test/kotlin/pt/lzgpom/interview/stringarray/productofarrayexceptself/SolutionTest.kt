package pt.lzgpom.interview.stringarray.productofarrayexceptself

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(24, 12, 8, 6)

        // WHEN
        val result = solution.productExceptSelf(nums)

        // THEN
        assertArrayEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(-1, 1, 0, -3, 3)
        val expected = intArrayOf(0, 0, 9, 0, 0)

        // WHEN
        val result = solution.productExceptSelf(nums)

        // THEN
        assertArrayEquals(expected, result)
    }
}