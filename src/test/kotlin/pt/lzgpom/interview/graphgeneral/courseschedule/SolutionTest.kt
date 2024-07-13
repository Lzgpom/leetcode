package pt.lzgpom.interview.graphgeneral.courseschedule

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty

class SolutionTest {

    private val solution = Solution()

    private class Input(val numCourses: Int, val prerequisites: Array<IntArray>)

    private val examples = listOf(
        Input(2, arrayOf(intArrayOf(1, 0))) to true,
        Input(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))) to false
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest(
                "the course should ${expected.notOrEmpty()} possible with ${input.numCourses}" +
                        " with the prerequisites ${arrayOfIntArrayToString(input.prerequisites)}"
            ) {

                // WHEN
                val result = solution.canFinish(input.numCourses, input.prerequisites)

                // THEN
                assertEquals(expected, result)
            }
        }

    private fun arrayOfIntArrayToString(array: Array<IntArray>): String {
        return array.joinToString { it.contentToString() }
    }
}