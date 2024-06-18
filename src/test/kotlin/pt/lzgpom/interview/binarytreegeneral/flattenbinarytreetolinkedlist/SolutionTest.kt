package pt.lzgpom.interview.binarytreegeneral.flattenbinarytreetolinkedlist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest{

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(1,2,5,3,4,null,6)) to listOf(1,null,2,null,3,null,4,null,5,null,6),
        TreeNode.buildTree(listOf()) to listOf(),
        TreeNode.buildTree(listOf(0)) to listOf(0)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} flattened should be $expected") {
                // WHEN
                solution.flatten(root)

                // THEN
                assertEquals(expected, TreeNode.treeToList(root))
            }
        }
}