package pt.lzgpom.interview.divideconquer.convertsortedarraytobinarysearchtree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        intArrayOf(-10, -3, 0, 5, 9) to listOf(0, -10, 5, null, -3, null, 9),
        intArrayOf(1, 3) to listOf(1, null, 3)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (nums, expected) ->
            dynamicTest("the array ${nums.contentToString()} should convert to tree $expected") {
                // WHEN
                val result = solution.sortedArrayToBST(nums)

                // THEN
                assertEquals(expected, TreeNode.treeToList(result))
            }
        }

    @Test
    fun test() {
        println(1 / 2)
    }
}