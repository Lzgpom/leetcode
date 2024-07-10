package pt.lzgpom.interview.binarytreegeneral.binarysearchtreeiterator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import pt.lzgpom.interview.binarytreegeneral.TreeNode

class BSTIteratorTest {

    @Test
    fun testWithExample() {
        // GIVEN
        val root = TreeNode.buildTree(listOf(7, 3, 15, null, null, 9, 20))

        // WHEN
        val iterator = BSTIterator(root)

        // THEN
        assertEquals(3, iterator.next())
        assertEquals(7, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(9, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(15, iterator.next())
        assertTrue(iterator.hasNext())
        assertEquals(20, iterator.next())
        assertFalse(iterator.hasNext())
    }
}