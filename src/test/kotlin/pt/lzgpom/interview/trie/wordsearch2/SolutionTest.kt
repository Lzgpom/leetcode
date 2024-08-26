package pt.lzgpom.interview.trie.wordsearch2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()

    private class Input(val board: Array<CharArray>, val words: Array<String>)

    private val examples = listOf(
        Input(
            arrayOf(
                charArrayOf('o','a','a','n'),
                charArrayOf('e','t','a','e'),
                charArrayOf('i','h','k','r'),
                charArrayOf('i','f','l','v'),
            ),
            arrayOf("oath","pea","eat","rain")
        ) to listOf("eat", "oath"),
        Input(
            arrayOf(
                charArrayOf('a', 'b'),
                charArrayOf('c', 'd'),
            ),
            arrayOf("abcd")
        ) to listOf()
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the only valid words should be $expected out of ${input.words.contentToString()}") {
                // WHEN
                val result = solution.findWords(input.board, input.words)

                // THEN
                assertEquals(expected.toSet(), result.toSet())
            }
        }
}