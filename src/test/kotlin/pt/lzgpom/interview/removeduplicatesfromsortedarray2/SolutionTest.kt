package pt.lzgpom.interview.removeduplicatesfromsortedarray2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(0,0,1,1,1,1,2,3,3)
        val expected = intArrayOf(0,0,1,1,2,3,3)

        // WHEN
        val result = solution.removeDuplicates(nums1)

        // THEN
        assertEquals(7, result)

        val resultNums = nums1.slice(0 .. 6).toIntArray()
        assertArrayEquals(expected, resultNums)
    }
}