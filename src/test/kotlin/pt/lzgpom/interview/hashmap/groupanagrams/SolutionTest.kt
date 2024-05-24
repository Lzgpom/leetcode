package pt.lzgpom.interview.hashmap.groupanagrams

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

        val expected = listOf(
            listOf("tan", "nat"),
            listOf("bat"),
            listOf("eat", "tea", "ate")
        )

        // WHEN
        val result = solution.groupAnagrams(strs)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val strs = arrayOf("")

        val expected = listOf(
            listOf("")
        )

        // WHEN
        val result = solution.groupAnagrams(strs)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val strs = arrayOf("a")

        val expected = listOf(
            listOf("a")
        )

        // WHEN
        val result = solution.groupAnagrams(strs)

        // THEN
        assertEquals(expected, result)
    }
}