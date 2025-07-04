package pt.lzgpom.problems.p3443

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "NSWWEW"
        val k = 3

        // WHEN
        val result = solution.maxDistance(s, k)

        // THEN
        assertEquals(6, result)
    }
}