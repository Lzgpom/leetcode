package pt.lzgpom.problems.p2342

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(18,43,36,13,7)

        // WHEN
        val result = solution.maximumSum(nums)

        // THEN
        assertEquals(54, result)
    }

}