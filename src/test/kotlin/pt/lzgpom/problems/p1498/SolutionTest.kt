package pt.lzgpom.problems.p1498

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(3, 5, 6, 7)
        val target = 9

        // WHEN
        val result = solution.numSubseq(nums, target)

        // THEN
        assertEquals(4, result)
    }

}