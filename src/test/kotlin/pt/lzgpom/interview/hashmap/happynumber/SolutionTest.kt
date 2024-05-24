package pt.lzgpom.interview.hashmap.happynumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val n = 19

        val expected = true

        // WHEN
        val result = solution.isHappy(n)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val n = 2

        val expected = false

        // WHEN
        val result = solution.isHappy(n)

        // THEN
        assertEquals(expected, result)
    }
}