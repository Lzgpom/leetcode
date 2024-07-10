package pt.lzgpom.interview.binarytreegeneral.lowestcommonancestorofabinarytree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        return dfs(root, p!!.`val`, q!!.`val`)
    }

    private fun dfs(root: TreeNode?, p: Int, q: Int): TreeNode? {
        if (root == null) {
            return null
        }

        if (root.`val` == p || root.`val` == q) {
            return root
        }

        val left = dfs(root.left, p, q)
        val right = dfs(root.right, p, q)

        if (left != null && right != null) {
            return root
        }

        if (left != null) {
            return left
        }

        return right
    }
}