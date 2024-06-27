package pt.lzgpom.interview.binarytreegeneral.lowestcommonancestorofabinarytree

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()

    private class Input(val root: TreeNode?, val p: TreeNode?, val q: TreeNode?)

    private val examples = listOf(
        Input(TreeNode.buildTree(listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)), TreeNode(5), TreeNode(1)) to 3,
        Input(TreeNode.buildTree(listOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)), TreeNode(5), TreeNode(4)) to 5,
        Input(TreeNode.buildTree(listOf(1, 2)), TreeNode(1), TreeNode(2)) to 1
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest(
                "the lca of the nodes ${input.p?.`val`} and ${input.q?.`val`} of the tree ${
                    TreeNode.treeToList(
                        input.root
                    )
                } should be $expected"
            ) {
                // WHEN
                val result = solution.lowestCommonAncestor(input.root, input.p, input.q)

                // THEN
                assertEquals(expected, result?.`val`)
            }
        }
}