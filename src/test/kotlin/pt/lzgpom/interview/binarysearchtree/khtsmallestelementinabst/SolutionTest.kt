package pt.lzgpom.interview.binarysearchtree.khtsmallestelementinabst

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()

    private class Input(val root: TreeNode?, val k: Int)

    private val examples = listOf(
        Input(TreeNode.buildTree(listOf(3, 1, 4, null, 2)), 1) to 1,
        Input(TreeNode.buildTree(listOf(5, 3, 6, 2, 4, null, null, 1)), 3) to 3,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the ${input.k}nt node in the tree ${TreeNode.treeToList(input.root)} should be $expected") {
                // WHEN
                val result = solution.kthSmallest(input.root, input.k)

                // THEN
                assertEquals(expected, result)
            }
        }
}