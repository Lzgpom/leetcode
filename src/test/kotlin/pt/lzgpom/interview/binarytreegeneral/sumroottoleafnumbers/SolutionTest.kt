package pt.lzgpom.interview.binarytreegeneral.sumroottoleafnumbers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(1, 2, 3)) to 25,
        TreeNode.buildTree(listOf(4, 9, 0, 5, 1)) to 1026,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} sum of root to leaf number should be $expected") {
                // WHEN
                val result = solution.sumNumbers(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}