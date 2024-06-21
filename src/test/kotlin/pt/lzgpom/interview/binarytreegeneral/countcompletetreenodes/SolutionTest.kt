package pt.lzgpom.interview.binarytreegeneral.countcompletetreenodes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(1,2,3,4,5,6)) to 6,
        TreeNode.buildTree(listOf(1)) to 1,
        TreeNode.buildTree(listOf()) to 0,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} has $expected nodes") {
                // WHEN
                val result = solution.countNodes(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}