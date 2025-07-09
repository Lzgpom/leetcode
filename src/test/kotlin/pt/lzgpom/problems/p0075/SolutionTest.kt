package pt.lzgpom.problems.p0075

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val nums = intArrayOf(2, 0, 2, 1, 1, 0)

        // WHEN
        solution.sortColors(nums)

        // THEN
        assertArrayEquals(intArrayOf(0, 0, 1, 1, 2, 2), nums)
    }

}