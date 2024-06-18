package pt.lzgpom.interview.binarytreegeneral.pathsum

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) {
            return false
        }

        if (root.left == null && root.right == null) {
            return root.`val` == targetSum
        }

        val newTargetSum = targetSum - root.`val`
        return hasPathSum(root.left, newTargetSum) ||
                hasPathSum(root.right, newTargetSum)
    }
}