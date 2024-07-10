package pt.lzgpom.interview.binarysearchtree.validatebinarysearchtree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(2, 1, 3)) to true,
        TreeNode.buildTree(listOf(5, 1, 4, null, null, 3, 6)) to false,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} is ${expected.notOrEmpty()} a valid binary search tree") {
                // WHEN
                val result = solution.isValidBST(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}