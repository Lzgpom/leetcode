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
        ) to 4,
        arrayOf(intArrayOf(0, 0)) to 1,
        arrayOf(intArrayOf(0, 1), intArrayOf(0, 0)) to 2,
        arrayOf(intArrayOf(-6, -1), intArrayOf(3, 1), intArrayOf(12, 3)) to 3,
        arrayOf(
            intArrayOf(0, 0),
            intArrayOf(4, 5),
            intArrayOf(7, 8),
            intArrayOf(8, 9),
            intArrayOf(5, 6),
            intArrayOf(3, 4),
            intArrayOf(1, 1),
        ) to 5,
        arrayOf(intArrayOf(5151, 5150), intArrayOf(0, 0), intArrayOf(5152, 5151)) to 2
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