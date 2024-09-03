package pt.lzgpom.interview.backtracking.nqueens2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        4 to 2,
        1 to 1
    )

    @TestFactory
    fun `test with examples`() = examples
        .map { (n, expected) ->
            dynamicTest("with $n queens in a $n by $n board there should be $expected solutions where no queens attack each other") {
                // WHEN
                val result = solution.totalNQueens(n)

                // THEN
                assertEquals(expected, result)
            }
        }
}