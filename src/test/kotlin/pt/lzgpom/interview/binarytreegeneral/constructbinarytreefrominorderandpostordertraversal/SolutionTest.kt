package pt.lzgpom.interview.binarytreegeneral.constructbinarytreefrominorderandpostordertraversal

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {
    private val solution = Solution()

    private class Input(val inorder: IntArray, val postorder: IntArray)

    private val examples = listOf(
        Input(intArrayOf(9, 3, 15, 20, 7), intArrayOf(9, 15, 7, 20, 3)) to listOf(3, 9, 20, null, null, 15, 7),
        Input(intArrayOf(-1), intArrayOf(-1)) to listOf(-1),
        Input(intArrayOf(3, 2, 1), intArrayOf(3, 2, 1)) to listOf(1, 2, null, 3)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the tree with postorder ${input.postorder} and inorder ${input.inorder} should be $expected") {
                // WHEN
                val result = solution.buildTree(input.inorder, input.postorder)

                // THEN
                assertEquals(expected, TreeNode.treeToList(result))
            }
        }
}