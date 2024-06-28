package pt.lzgpom.interview.binarytreebfs.binarytreezigzaglevelordertraversal

import pt.lzgpom.interview.binarytreegeneral.TreeNode
import java.util.*

class Solution {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val queue = LinkedList<TreeNode>()
        root?.let { queue.add(it) }

        val levels = mutableListOf<List<Int>>()
        var reverse = false

        while (queue.isNotEmpty()) {
            val numberOfNodesInLevel = queue.size
            val level = LinkedList<Int>()

            for (i in 0 until numberOfNodesInLevel) {
                val node = queue.poll()

                if (reverse) {
                    level.addFirst(node.`val`)
                } else {
                    level.addLast(node.`val`)
                }

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }

            levels.add(level)
            reverse = !reverse
        }

        return levels
    }
}