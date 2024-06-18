package pt.lzgpom.interview.binarytreegeneral.flattenbinarytreetolinkedlist

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun flatten(root: TreeNode?) {
        fun helper(root: TreeNode?): TreeNode? {
            if (root == null) {
                return null
            }

            val left = root.left
            val right = root.right

            if (left == null && right == null) {
                return root
            }

            root.left = null

            val lastLeft = helper(left)
            val lastRight = helper(right)
            if (lastLeft != null && lastRight != null) {
                root.right = left
                lastLeft.right = right

                return lastRight
            } else if (lastLeft != null) {
                root.right = left
                return lastLeft
            } else {
                return lastRight
            }
        }

        helper(root)
    }
}