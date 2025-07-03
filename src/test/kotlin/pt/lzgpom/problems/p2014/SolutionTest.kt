package pt.lzgpom.problems.p2014

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val word = "letsleetcode"
        val k = 2

        // WHEN
        val result = solution.longestSubsequenceRepeatedK(word, k)

        // THEN
        assertTrue(setOf("let", "ete").contains(result))
    }
}