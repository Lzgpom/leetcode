package pt.lzgpom.interview.graphgeneral.numberofislands

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
        ) to 1,
        arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1'),
        ) to 3,
        arrayOf(
            charArrayOf('1', '1', '1'),
            charArrayOf('0', '1', '0'),
            charArrayOf('1', '1', '1'),
        ) to 1,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (grid, expected) ->
            dynamicTest("the grid should have $expected separate islands") {
                // WHEN
                val result = solution.numIslands(grid)

                // THEN
                assertEquals(expected, result)
            }
        }
}