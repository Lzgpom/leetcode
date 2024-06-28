package pt.lzgpom.interview.binarysearchtree.validatebinarysearchtree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        var prev: Int? = null

        fun helper(root: TreeNode?): Boolean {
            if (root == null) {
                return true
            }

            val left = helper(root.left)
            if (!left) {
                return false
            }

            if (prev != null && root.`val` <= prev!!) {
                return false
            }

            prev = root.`val`

            return helper(root.right)
        }

        return helper(root)
    }
}