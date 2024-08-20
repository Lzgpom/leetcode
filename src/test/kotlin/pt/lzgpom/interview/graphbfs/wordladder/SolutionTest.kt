package pt.lzgpom.interview.graphbfs.wordladder

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()

    private class Input(val beginWord: String, val endWord: String, val wordList: List<String>)

    private val examples = listOf(
        Input(
            "hit",
            "cog",
            listOf("hot", "dot", "dog", "lot", "log", "cog")
        ) to 5,
        Input(
            "hit",
            "cog",
            listOf("hot", "dot", "dog", "lot", "log")
        ) to 0
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest(
                "it should take $expected steps to convert from ${input.beginWord} to ${input.endWord}" +
                        "with the following word list ${input.wordList}"
            ) {
                // WHEN
                val result = solution.ladderLength(input.beginWord, input.endWord, input.wordList)

                // THEN
                assertEquals(expected, result)
            }
        }
}