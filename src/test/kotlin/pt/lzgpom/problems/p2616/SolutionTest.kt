package pt.lzgpom.problems.p2616

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(10,1,2,7,1,3)
        val p = 2

        // WHEN
        val result = solution.minimizeMax(nums, p)

        // THEN
        assertEquals(1, result)
    }
}