package pt.lzgpom.interview.binarytreegeneral.symmetrictree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymmetric(root?.left, root?.right)
    }

    private fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }

        if (left?.`val` != right?.`val`) {
            return false
        }

        return isSymmetric(left?.left, right?.right) &&
                isSymmetric(left?.right, right?.left)
    }
}