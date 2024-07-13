package pt.lzgpom.interview.graphgeneral.evaluatedivision

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()

    private class Input(val equations: List<List<String>>, val values: DoubleArray, val queries: List<List<String>>)

    private val examples = listOf(
        Input(
            listOf(listOf("a", "b"), listOf("b", "c")),
            doubleArrayOf(2.0, 3.0),
            listOf(listOf("a", "c"), listOf("b", "a"), listOf("a", "e"), listOf("a", "a"), listOf("x", "x"))
        ) to doubleArrayOf(6.0, 0.5, -1.0, 1.0, -1.0),
        Input(
            listOf(listOf("a", "b"), listOf("b", "c"), listOf("bc", "cd")),
            doubleArrayOf(1.5, 2.5, 5.0),
            listOf(listOf("a", "c"), listOf("c", "b"), listOf("bc", "cd"), listOf("cd", "bc"))
        ) to doubleArrayOf(3.75, 0.4, 5.0, 0.2),
        Input(
            listOf(listOf("a", "b")),
            doubleArrayOf(0.5),
            listOf(listOf("a", "b"), listOf("b", "a"), listOf("a", "c"), listOf("x", "y"))
        ) to doubleArrayOf(0.5, 2.0, -1.0, -1.0)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the equation results should be ${expected.contentToString()}") {
                // WHEN
                val result = solution.calcEquation(input.equations, input.values, input.queries)

                // THEN
                assertArrayEquals(expected, result)
            }
        }
}