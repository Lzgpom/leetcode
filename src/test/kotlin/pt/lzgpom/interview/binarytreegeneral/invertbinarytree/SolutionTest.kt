package pt.lzgpom.interview.binarytreegeneral.invertbinarytree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(4, 2, 7, 1, 3, 6, 9)) to listOf(4, 7, 2, 9, 6, 3, 1),
        TreeNode.buildTree(listOf(2, 1, 3)) to listOf(2, 3, 1)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} inverted should be $expected") {
                // WHEN
                val result = solution.invertTree(root)

                // THEN
                assertEquals(expected, TreeNode.treeToList(result))
            }
        }
}