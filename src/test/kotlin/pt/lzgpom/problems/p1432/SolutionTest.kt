package pt.lzgpom.problems.p1432

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val num = 123456

        // WHEN
        val result = solution.maxDiff(num)

        // THEN
        assertEquals(820000, result)
    }

}