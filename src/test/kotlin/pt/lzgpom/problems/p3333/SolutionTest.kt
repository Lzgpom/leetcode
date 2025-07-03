package pt.lzgpom.problems.p3333

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val word = "aaabbb"
        val k = 3

        // WHEN
        val result = solution.possibleStringCount(word, k)

        // THEN
        assertEquals(8, result)
    }

}