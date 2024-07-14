package pt.lzgpom.interview.graphgeneral.courseschedule2

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()

    private class Input(val numCourses: Int, val prerequisites: Array<IntArray>)

    private val examples = listOf(
        Input(2, arrayOf(intArrayOf(1, 0))) to intArrayOf(0, 1),
        Input(4, arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))) to intArrayOf(
            0,
            2,
            1,
            3
        ),
        Input(1, arrayOf()) to intArrayOf(0)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest(
                "the order of the courses ${input.numCourses} with prerequisites" +
                        "${arrayOfIntArrayToString(input.prerequisites)} should be ${expected.contentToString()}"
            ) {

                // WHEN
                val result = solution.findOrder(input.numCourses, input.prerequisites)

                // THEN
                assertArrayEquals(expected, result)
            }
        }

    private fun arrayOfIntArrayToString(array: Array<IntArray>): String {
        return array.joinToString { it.contentToString() }
    }
}