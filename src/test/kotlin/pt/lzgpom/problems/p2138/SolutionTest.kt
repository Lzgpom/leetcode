package pt.lzgpom.problems.p2138

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "abcdefghij"
        val k = 3
        val fill = 'x'

        // WHEN
        val result = solution.divideString(s, k, fill)

        // THEN
        assertArrayEquals(arrayOf("abc","def","ghi","jxx"), result)
    }
}