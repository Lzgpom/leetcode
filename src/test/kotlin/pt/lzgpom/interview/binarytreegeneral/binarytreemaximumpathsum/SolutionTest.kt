package pt.lzgpom.interview.binarytreegeneral.binarytreemaximumpathsum

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(1, 2, 3)) to 6,
        TreeNode.buildTree(listOf(-10, 9, 20, null, null, 15, 7)) to 42,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the maximum path sum of the tree ${TreeNode.treeToList(root)} should be $expected") {
                // WHEN
                val result = solution.maxPathSum(root)

                // THEN
                assertEquals(result, expected)
            }
        }
}