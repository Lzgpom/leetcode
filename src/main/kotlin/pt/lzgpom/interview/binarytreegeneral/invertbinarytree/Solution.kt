package pt.lzgpom.interview.binarytreegeneral.invertbinarytree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val temp = root.left
        root.left = root.right
        root.right = temp

        invertTree(root.left)
        invertTree(root.right)
        return root
    }
}