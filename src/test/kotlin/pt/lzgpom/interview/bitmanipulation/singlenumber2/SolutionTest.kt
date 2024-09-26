package pt.lzgpom.interview.bitmanipulation.singlenumber2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(2, 2, 2, 3) to 3,
        intArrayOf(0, 1, 0, 1, 0, 1, 99) to 99
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the only single number in ${nums.contentToString()} should be $expected") {
                // WHEN
                val result = solution.singleNumber(nums)

                // THEN
                assertEquals(expected, result)
            }
        }
}