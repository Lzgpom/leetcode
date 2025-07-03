package pt.lzgpom.problems.p3330

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val word = "abbcccc"

        // WHEN
        val result = solution.possibleStringCount(word)

        // THEN
        assertEquals(5, result)
    }

}