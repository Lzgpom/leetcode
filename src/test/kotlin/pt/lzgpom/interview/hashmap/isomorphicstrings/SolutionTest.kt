package pt.lzgpom.interview.hashmap.isomorphicstrings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "egg"
        val t = "add"

        val expected = true

        // WHEN
        val result = solution.isIsomorphic(s, t)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "foo"
        val t = "bar"

        val expected = false

        // WHEN
        val result = solution.isIsomorphic(s, t)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val s = "paper"
        val t = "title"

        val expected = true

        // WHEN
        val result = solution.isIsomorphic(s, t)

        // THEN
        assertEquals(expected, result)
    }
}