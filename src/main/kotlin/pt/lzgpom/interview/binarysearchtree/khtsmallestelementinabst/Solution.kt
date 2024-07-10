package pt.lzgpom.interview.binarysearchtree.khtsmallestelementinabst

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        var pos = 1

        fun helper(root: TreeNode?): Int? {
            if (root == null) {
                return null
            }

            val left = helper(root.left)
            if (left != null) {
                return left
            }

            if (pos == k) {
                return root.`val`
            }

            pos++

            return helper(root.right)
        }

        return helper(root)!!
    }
}