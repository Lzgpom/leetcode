package pt.lzgpom.interview.stringarray.textjustification

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class
SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val words = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
        val maxWith = 16
        val expected = listOf(
            "This    is    an",
            "example  of text",
            "justification.  "
        )

        // WHEN
        val result = solution.fullJustify(words, maxWith)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val words = arrayOf("What", "must", "be", "acknowledgment", "shall", "be")
        val maxWith = 16
        val expected = listOf(
            "What   must   be",
            "acknowledgment  ",
            "shall be        "
        )

        // WHEN
        val result = solution.fullJustify(words, maxWith)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExampl3() {
        // GIVEN
        val words = arrayOf(
            "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
            "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"
        )
        val maxWith = 20
        val expected = listOf(
            "Science  is  what we",
            "understand      well",
            "enough to explain to",
            "a  computer.  Art is",
            "everything  else  we",
            "do                  "
        )

        // WHEN
        val result = solution.fullJustify(words, maxWith)

        // THEN
        assertEquals(expected, result)
    }
}