package pt.lzgpom.interview.binarytreebfs.binarytreezigzaglevelordertraversal

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(3,9,20,null,null,15,7)) to listOf(listOf(3), listOf(20, 9), listOf(15, 7)),
        TreeNode.buildTree(listOf(1)) to listOf(listOf(1)),
        TreeNode.buildTree(listOf()) to listOf()
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} has the following levels in zigzag $expected") {
                // WHEN
                val result = solution.zigzagLevelOrder(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}