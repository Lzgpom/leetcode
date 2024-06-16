package pt.lzgpom.interview.binarytreegeneral.maximumdepthofbinarytree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(3, 9, 20, null, null, 15, 7)) to 3,
        TreeNode.buildTree(listOf(1, null, 2)) to 2,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} should have $expected depth") {
                // WHEN
                val result = solution.maxDepth(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}