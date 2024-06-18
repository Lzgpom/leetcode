package pt.lzgpom.interview.binarytreegeneral.constructbinarytreefrompreorderandinordertraversal

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()

    private class Input(val preorder: IntArray, val inorder: IntArray)

    private val examples = listOf(
        Input(intArrayOf(3, 9, 20, 15, 7), intArrayOf(9, 3, 15, 20, 7)) to listOf(3, 9, 20, null, null, 15, 7),
        Input(intArrayOf(-1), intArrayOf(-1)) to listOf(-1),
        Input(intArrayOf(1, 2), intArrayOf(1, 2)) to listOf(1, null, 2),
        Input(intArrayOf(1, 2, 3), intArrayOf(2, 3, 1)) to listOf(1, 2, null, null, 3),
        Input(intArrayOf(3, 1, 2, 4), intArrayOf(1, 2, 3, 4)) to listOf(3, 1, 4, null, 2),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the tree with preorder ${input.preorder} and inorder ${input.inorder} should be $expected") {
                // WHEN
                val result = solution.buildTree(input.preorder, input.inorder)

                // THEN
                assertEquals(expected, TreeNode.treeToList(result))
            }
        }
}