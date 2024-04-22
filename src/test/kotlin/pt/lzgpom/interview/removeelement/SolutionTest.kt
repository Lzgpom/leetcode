package pt.lzgpom.interview.removeelement

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums1 = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val expected = setOf(0, 1, 4, 0, 3)

        // WHEN
        val result = solution.removeElement(nums1, 2)

        // THEN
        assertEquals(5, result)

        val resultNums = nums1.slice(0 .. 4).toSet()
        assertEquals(expected, resultNums)
    }
}