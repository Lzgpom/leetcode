package pt.lzgpom.problems.p1061

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s1 = "hello"
        val s2 = "world"
        val baseStr = "hold"

        // WHEN
        val result = solution.smallestEquivalentString(s1, s2, baseStr)

        // THEN
        assertEquals(result, "hdld")
    }
}