package pt.lzgpom.interview.backtracking.permutations

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(1, 2, 3) to listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1),
        ),
        intArrayOf(0, 1) to listOf(
            listOf(0, 1),
            listOf(1, 0)
        ),
        intArrayOf(1) to listOf(
            listOf(1)
        )
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("permute should create ${expected.size} permutations from the array ${nums.contentToString()}") {
                // WHEN
                val result = solution.permute(nums)

                // THEN
                assertEquals(expected.size, result.size)
                assertTrue(result.containsAll(expected))
            }
        }

}