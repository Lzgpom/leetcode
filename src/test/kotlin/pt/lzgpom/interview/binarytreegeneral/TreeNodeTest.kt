package pt.lzgpom.interview.binarytreegeneral

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TreeNodeTest {

    @Test
    fun ensureThatBuildTreeCreatesTreeFromList() {
        // GIVEN
        val list = listOf(1, null, 2)

        // WHEN
        val root = TreeNode.buildTree(list)

        // THEN
        assertEquals(1, root?.`val`)
        assertEquals(null, root?.left)
        assertEquals(2, root?.right?.`val`)
    }

    @Test
    fun ensureThatBuildTreeCreatesTreeFromListWithThreeLayers() {
        // GIVEN
        val list = listOf(3, 9, 20, null, null, 15, 7)

        // WHEN
        val root = TreeNode.buildTree(list)

        // THEN
        assertEquals(3, root?.`val`)
        assertEquals(9, root?.left?.`val`)
        assertEquals(20, root?.right?.`val`)
        assertEquals(null, root?.left?.left?.`val`)
        assertEquals(null, root?.left?.right?.`val`)
        assertEquals(15, root?.right?.left?.`val`)
        assertEquals(7, root?.right?.right?.`val`)
    }

    @Test
    fun ensureThatTreeToListAddsAllValuesOfTreeInCorrectOrder() {
        // GIVEN
        val originalList = listOf(3, 9, 20, null, null, 15, 7)
        val root = TreeNode.buildTree(originalList)

        // WHEN
        val result = TreeNode.treeToList(root)

        // THEN
        assertEquals(originalList, result)
    }
}
