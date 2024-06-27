package pt.lzgpom.interview.binarytreegeneral.binarysearchtreeiterator

import pt.lzgpom.interview.binarytreegeneral.TreeNode
import java.util.*

class BSTIterator(root: TreeNode?) {
    private val nodes = Stack<TreeNode>()

    init {
        addLefts(root)
    }

    fun next(): Int {
        val next = nodes.pop()
        addLefts(next.right)

        return next.`val`
    }

    fun hasNext(): Boolean {
        return nodes.isNotEmpty()
    }

    private fun addLefts(root: TreeNode?) {
        var node = root

        while (node != null) {
            nodes.push(node)
            node = node.left
        }
    }
}