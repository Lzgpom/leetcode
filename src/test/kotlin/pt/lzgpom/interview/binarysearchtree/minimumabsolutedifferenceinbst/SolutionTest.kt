package pt.lzgpom.interview.binarysearchtree.minimumabsolutedifferenceinbst

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(4, 2, 6, 1, 3)) to 1,
        TreeNode.buildTree(listOf(1, 0, 48, null, null, 12, 49)) to 1,
        TreeNode.buildTree(listOf(236, 104, 701, null, 227, null, 911)) to 9,
        TreeNode.buildTree(listOf(600, 424, 612, null, 499, null, 689)) to 12,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the tree ${TreeNode.treeToList(root)} minimum absolute difference should be $expected") {
                // WHEN
                val result = solution.getMinimumDifference(root)

                // THEN
                assertEquals(expected, result)
            }
        }
}