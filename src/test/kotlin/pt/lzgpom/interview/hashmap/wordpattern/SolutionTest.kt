package pt.lzgpom.interview.hashmap.wordpattern

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val pattern = "abba"
        val s = "dog cat cat dog"

        val expected = true

        // WHEN
        val result = solution.wordPattern(pattern, s)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val pattern = "abba"
        val s = "dog cat cat fish"

        val expected = false

        // WHEN
        val result = solution.wordPattern(pattern, s)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val pattern = "aaaa"
        val s = "dog cat cat dog"

        val expected = false

        // WHEN
        val result = solution.wordPattern(pattern, s)

        // THEN
        assertEquals(expected, result)
    }
}