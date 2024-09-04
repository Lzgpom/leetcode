package pt.lzgpom.interview.backtracking.wordsearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty

class SolutionTest {
    private val solution = Solution()

    private class Input(val board: Array<CharArray>, val word: String)

    private val examples = listOf(
        Input(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E'),
            ), "ABCCED"
        ) to true,
        Input(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E'),
            ), "SEE"
        ) to true,
        Input(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E'),
            ), "ABCB"
        ) to false
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the word ${input.word} should ${expected.notOrEmpty()} be in the board") {
                // WHEN
                val result = solution.exist(input.board, input.word)

                // THEN
                assertEquals(expected, result)
            }
        }
}