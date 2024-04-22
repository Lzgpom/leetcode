package pt.lzgpom.interview.mergesortedarray

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2,5,6)

        // WHEN
        solution.merge(nums1, 3, nums2, 3)

        // THEN
        assertArrayEquals(nums1, intArrayOf(1,2,2,3,5,6))
    }
}