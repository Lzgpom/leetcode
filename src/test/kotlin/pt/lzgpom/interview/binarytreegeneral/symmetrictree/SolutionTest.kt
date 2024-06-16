package pt.lzgpom.interview.binarytreegeneral.symmetrictree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(1, 2, 2, 3, 4, 4, 3)) to true,
        TreeNode.buildTree(listOf(1, 2, 2, null, 3, null, 3)) to false,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} should ${expected.notOrEmpty()} be symmetric") {
                // WHEN
                val result = solution.isSymmetric(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}