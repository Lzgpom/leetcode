package pt.lzgpom.interview.removeduplicatesfromsortedarray

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val expected = intArrayOf(0,1,2,3,4)

        // WHEN
        val result = solution.removeDuplicates(nums1)

        // THEN
        assertEquals(5, result)

        val resultNums = nums1.slice(0 .. 4).toIntArray()
        assertArrayEquals(expected, resultNums)
    }
}