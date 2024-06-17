package pt.lzgpom.interview.binarytreegeneral

import java.util.*

class TreeNode(var `val`: Int, var left: TreeNode?, var right: TreeNode?) {

    constructor(`val`: Int) : this(`val`, null, null)

    companion object {
        fun buildTree(nums: List<Int?>): TreeNode? {
            if (nums.isEmpty()) {
                return null
            }

            val root = TreeNode(nums[0]!!, null, null)
            val q: Queue<TreeNode?> = LinkedList()
            q.add(root)

            var i = 1
            while (i < nums.size) {
                val curr = q.remove()!!

                if (i < nums.size) {
                    val next = nums[i++]
                    if (next != null) {
                        curr.left = TreeNode(next, null, null)
                        q.add(curr.left)
                    }
                }
                if (i < nums.size) {
                    val next = nums[i++]
                    if (next != null) {
                        curr.right = TreeNode(next, null, null)
                        q.add(curr.right)
                    }
                }
            }
            return root
        }

        fun treeToList(root: TreeNode?): List<Int?> {
            val list = mutableListOf<Int?>()
            val queue: Queue<TreeNode?> = LinkedList()
            queue.add(root)

            while (queue.isNotEmpty() && !queue.all { it == null }) {
                val node = queue.poll()
                list.add(node?.`val`)

                if (node != null) {
                    queue.add(node.left)
                    queue.add(node.right)
                }
            }

            return list
        }
    }
}