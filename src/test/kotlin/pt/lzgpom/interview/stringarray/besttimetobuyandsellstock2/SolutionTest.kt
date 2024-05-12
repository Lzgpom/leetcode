package pt.lzgpom.interview.stringarray.besttimetobuyandsellstock2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(7,1,5,3,6,4)
        val expected = 7

        // WHEN
        val result = solution.maxProfit(nums1)

        // THEN
        assertEquals(expected, result)
    }

}