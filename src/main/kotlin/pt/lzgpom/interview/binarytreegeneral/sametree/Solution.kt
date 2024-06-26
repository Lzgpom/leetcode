package pt.lzgpom.interview.binarytreegeneral.sametree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }

        if (p?.`val` != q?.`val`) {
            return false
        }

        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
}