package pt.lzgpom.problems.p2311

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "000101010011011001011101111000111111100001011000000100010000111100000011111001000111100111101001111001011101001011011101001011011001111111010011100011110111010000010000010111001001111101100001111"
        val k = 300429827

        // WHEN
        val result = solution.longestSubsequence(s, k)

        // THEN
        assertEquals(108, result)
    }
}