package pt.lzgpom.interview.math.maxpointsonaline

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3)) to 3,
        arrayOf(
            intArrayOf(1, 1),
            intArrayOf(3, 2),
            intArrayOf(5, 3),
            intArrayOf(4, 1),
            intArrayOf(2, 3),
            intArrayOf(1, 4)
        ) to 4
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (points, expected) ->
            dynamicTest("it should have $expected points in a line") {
                // WHEN
                val result = solution.maxPoints(points)

                // THEN
                assertEquals(expected, result)
            }
        }
}