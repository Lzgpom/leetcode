package pt.lzgpom.problems.p0386

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val n = 13

        // WHEN
        val result = solution.lexicalOrder(n)

        // THEN
        assertEquals(listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9), result)
    }
}