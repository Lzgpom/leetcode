package pt.lzgpom.interview.binarytreebfs.binarytreelevelordertraversal

import pt.lzgpom.interview.binarytreegeneral.TreeNode
import java.util.LinkedList
import java.util.Queue

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue: Queue<TreeNode> = LinkedList()
        root?.let { queue.add(it) }

        val levels = mutableListOf<List<Int>>()
        while (queue.isNotEmpty()) {
            val numberOfNodesInLevel = queue.size
            val level = mutableListOf<Int>()

            for (i in 0 until numberOfNodesInLevel) {
                val node = queue.poll()
                level.add(node.`val`)

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }

            levels.add(level)
        }

        return levels
    }
}