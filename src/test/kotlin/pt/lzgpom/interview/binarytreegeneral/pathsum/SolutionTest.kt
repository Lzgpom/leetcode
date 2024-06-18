package pt.lzgpom.interview.binarytreegeneral.pathsum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()

    private class Input(val root: TreeNode?, val targetSum: Int)

    private val examples = listOf(
        Input(TreeNode.buildTree(listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1)), 22) to true,
        Input(TreeNode.buildTree(listOf(1, 2, 3)), 5) to false,
        Input(TreeNode.buildTree(listOf()), 0) to false,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(input.root)} as a path with sum of ${input.targetSum}") {
                // WHEN
                val result = solution.hasPathSum(input.root, input.targetSum)

                // THEN
                assertEquals(expected, result)
            }
        }
}