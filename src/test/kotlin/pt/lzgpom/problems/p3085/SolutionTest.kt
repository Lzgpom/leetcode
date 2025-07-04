package pt.lzgpom.problems.p3085

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val word = "vvnowvov"
        val k = 2

        // WHEN
        val result = solution.minimumDeletions(word, k)

        // THEN
        assertEquals(1, result)
    }
}