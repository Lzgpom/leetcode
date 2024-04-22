package pt.lzgpom.interview.rotatearray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(1, 2)
        val expected = intArrayOf(1, 2)

        // WHEN
        solution.rotate(nums1, 2)

        // THEN
        println(nums1.contentToString())
        assertArrayEquals(expected, nums1)
    }
}