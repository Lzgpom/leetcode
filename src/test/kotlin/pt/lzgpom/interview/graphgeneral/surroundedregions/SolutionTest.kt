package pt.lzgpom.interview.graphgeneral.surroundedregions

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        ) to arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        ),
        arrayOf(
            charArrayOf('X'),
        ) to arrayOf(
            charArrayOf('X')
        ),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (board, expected) ->
            dynamicTest("should update the board with the surrounded regions") {
                // WHEN
                solution.solve(board)

                // THEN
                assertEquals(expected.size, board.size)

                board.zip(expected).forEach {(l1, l2) ->
                    assertArrayEquals(l1, l2)
                }
            }
        }
}