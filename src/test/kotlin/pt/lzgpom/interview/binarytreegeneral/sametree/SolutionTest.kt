package pt.lzgpom.interview.binarytreegeneral.sametree

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()

    private data class Input(val p: TreeNode?, val q: TreeNode?)

    private val examples = listOf(
        Input(TreeNode.buildTree(listOf(1, 2, 3)), TreeNode.buildTree(listOf(1, 2, 3))) to true,
        Input(TreeNode.buildTree(listOf(1, 2)), TreeNode.buildTree(listOf(1, null, 2))) to false,
        Input(TreeNode.buildTree(listOf(1, 2, 1)), TreeNode.buildTree(listOf(1, 1, 2))) to false
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(input.p)} and tree ${TreeNode.treeToList(input.q)} should ${expected.notOrEmpty()} be equal") {
                // WHEN
                val result = solution.isSameTree(input.p, input.q)

                // THEN
                assertEquals(expected, result)
            }
        }
}