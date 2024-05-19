package pt.lzgpom.interview.slidingwindow.substringwithconcatonationofallwords

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val s = "barfoothefoobarman"
        val words = arrayOf("foo", "bar")

        val expected = listOf(0, 9)

        // WHEN
        val result = solution.findSubstring(s, words)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val s = "wordgoodgoodgoodbestword"
        val words = arrayOf("word", "good", "best", "word")

        val expected = listOf<Int>()

        // WHEN
        val result = solution.findSubstring(s, words)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val s = "barfoofoobarthefoobarman"
        val words = arrayOf("bar", "foo", "the")

        val expected = listOf(6, 9, 12)

        // WHEN
        val result = solution.findSubstring(s, words)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample4() {
        // GIVEN
        val s = "lingmindraboofooowingdingbarrwingmonkeypoundcake"
        val words = arrayOf("fooo", "barr", "wing", "ding", "wing")

        val expected = listOf(13)

        // WHEN
        val result = solution.findSubstring(s, words)

        // THEN
        assertEquals(expected, result)
    }
}