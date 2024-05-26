package pt.lzgpom.interview.intervals.summaryranges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(0, 1, 2, 4, 5, 7)

        val expected = listOf("0->2", "4->5", "7")

        // WHEN
        val result = solution.summaryRanges(nums)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val nums = intArrayOf(0, 2, 3, 4, 6, 8, 9)

        val expected = listOf("0", "2->4", "6", "8->9")

        // WHEN
        val result = solution.summaryRanges(nums)

        // THEN
        assertEquals(expected, result)
    }
}