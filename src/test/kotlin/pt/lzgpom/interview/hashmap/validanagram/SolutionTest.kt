package pt.lzgpom.interview.hashmap.validanagram

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "anagram"
        val t = "nagaram"

        val expected = true

        // WHEN
        val result = solution.isAnagram(s, t)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "rat"
        val t = "car"

        val expected = false

        // WHEN
        val result = solution.isAnagram(s, t)

        // THEN
        assertEquals(expected, result)
    }
}