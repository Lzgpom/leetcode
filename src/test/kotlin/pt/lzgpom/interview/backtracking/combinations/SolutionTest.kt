package pt.lzgpom.interview.backtracking.combinations

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()

    private class Input(val n: Int, val k: Int)

    private val examples = listOf(
        Input(4, 2) to listOf(
            listOf(1, 2),
            listOf(1, 3),
            listOf(1, 4),
            listOf(2, 3),
            listOf(2, 4),
            listOf(3, 4),
        ),
        Input(1, 1) to listOf(listOf(1))
    )

    @TestFactory
    fun tesWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the combinations of the values 1 to ${input.n} of size ${input.k} should be $expected") {
                // WHEN
                val result = solution.combine(input.n, input.k)

                // THEN
                assertEquals(expected, result)
            }
        }
}