package pt.lzgpom.interview.stringarray.majorityelement

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(2,2,1,1,1,2,2)
        val expected = 2

        // WHEN
        val result = solution.majorityElement(nums1)

        // THEN
        assertEquals(expected, result)
    }
}