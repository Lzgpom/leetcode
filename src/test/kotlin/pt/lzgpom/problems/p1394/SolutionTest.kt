package pt.lzgpom.problems.p1394

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val arr = intArrayOf(1, 2, 2, 3, 3, 3)

        // WHEN
        val result = solution.findLucky(arr)

        // THEN
        assertEquals(3, result)
    }
}