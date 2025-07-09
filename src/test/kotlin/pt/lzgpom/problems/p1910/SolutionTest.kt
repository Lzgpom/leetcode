package pt.lzgpom.problems.p1910

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "axxxxyyyyb"
        val part = "xy"

        // WHEN
        val result = solution.removeOccurrences(s, part)

        // THEN
        assertEquals("ab", result)
    }

}