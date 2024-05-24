package pt.lzgpom.interview.hashmap.ransomnote

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val ransomNote = "a"
        val magazine = "b"

        val expected = false

        // WHEN
        val result = solution.canConstruct(ransomNote, magazine)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val ransomNote = "aa"
        val magazine = "ab"

        val expected = false

        // WHEN
        val result = solution.canConstruct(ransomNote, magazine)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val ransomNote = "aa"
        val magazine = "aab"

        val expected = true

        // WHEN
        val result = solution.canConstruct(ransomNote, magazine)

        // THEN
        assertEquals(expected, result)
    }
}