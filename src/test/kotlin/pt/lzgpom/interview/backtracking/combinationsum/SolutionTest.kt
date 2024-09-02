package pt.lzgpom.interview.backtracking.combinationsum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val candidates: IntArray, val target: Int)

    private val solution = Solution()
    private val examples = listOf(
        Input(intArrayOf(2, 3, 6, 7), 7) to listOf(
            listOf(2, 2, 3),
            listOf(7)
        ),
        Input(intArrayOf(2, 3, 5), 8) to listOf(
            listOf(2, 2, 2, 2),
            listOf(2, 3, 3),
            listOf(3, 5)
        ),
        Input(intArrayOf(2), 1) to listOf()
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the combinations with the candidates ${input.candidates.contentToString()} and the target ${input.target} should be $expected") {
                // WHEN
                val result = solution.combinationSum(input.candidates, input.target)

                // THEN
                println(result)
                assertEquals(expected.size, result.size)
                assertTrue(result.containsAll(expected))
            }
        }

}