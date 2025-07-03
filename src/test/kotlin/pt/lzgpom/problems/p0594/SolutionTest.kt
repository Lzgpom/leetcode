package pt.lzgpom.problems.p0594

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)

        // WHEN
        val result = solution.findLHS(nums)

        // THEN
        assertEquals(5, result)
    }

}