package pt.lzgpom.interview.binarytreebfs.binarytreerightsideview

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(1, 2, 3, null, 5, null, 4)) to listOf(1, 3, 4),
        TreeNode.buildTree(listOf(1, null, 3)) to listOf(1, 3),
        TreeNode.buildTree(listOf()) to listOf(),
        TreeNode.buildTree(listOf(1, 2, 3, null, 5, 6, null, 4)) to listOf(1, 3, 6, 4),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the right side view of the tree ${TreeNode.treeToList(root)} should be $expected") {
                // WHEN
                val result = solution.rightSideView(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}