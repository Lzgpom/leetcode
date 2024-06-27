package pt.lzgpom.interview.binarytreebfs.averageoflevelsinbinarytree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        TreeNode.buildTree(listOf(3, 9, 20, null, null, 15, 7)) to doubleArrayOf(3.0, 14.5, 11.0),
        TreeNode.buildTree(listOf(3, 9, 20, 15, 7)) to doubleArrayOf(3.00000, 14.50000, 11.00000),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (root, expected) ->
            dynamicTest("the average of the levels of the tree ${TreeNode.treeToList(root)} should be ${expected.contentToString()}") {
                // WHEN
                val result = solution.averageOfLevels(root)

                // THEN
                assertArrayEquals(expected, result)
            }
        }
}