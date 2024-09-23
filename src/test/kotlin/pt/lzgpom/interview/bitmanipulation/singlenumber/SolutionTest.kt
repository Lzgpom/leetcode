package pt.lzgpom.interview.bitmanipulation.singlenumber

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(2, 2, 1) to 1,
        intArrayOf(4, 1, 2, 1, 2) to 4,
        intArrayOf(1) to 1,
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