package pt.lzgpom.interview.binarytreegeneral.countcompletetreenodes

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val left = countNodes(root.left)
        val right = countNodes(root.right)

        return left + right + 1
    }
}