package pt.lzgpom.problems.p2016

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(7, 1, 5, 4)

        // WHEN
        val result = solution.maximumDifference(nums)

        // THEN
        assertEquals(4, result)
    }
}