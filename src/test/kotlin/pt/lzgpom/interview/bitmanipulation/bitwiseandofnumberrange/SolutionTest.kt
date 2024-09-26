package pt.lzgpom.interview.bitmanipulation.bitwiseandofnumberrange

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        5 .. 7 to 4,
        0 .. 0 to 0,
        1 .. 2147483647 to 0,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (range, expected) ->
            dynamicTest("the bitwise and of the range $range should be $expected") {
                // WHEN
                val result = solution.rangeBitwiseAnd(range.first, range.last)

                // THEN
                assertEquals(expected, result)
            }
        }
}