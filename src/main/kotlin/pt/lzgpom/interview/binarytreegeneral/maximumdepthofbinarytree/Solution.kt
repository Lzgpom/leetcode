package pt.lzgpom.interview.binarytreegeneral.maximumdepthofbinarytree

import pt.lzgpom.interview.binarytreegeneral.TreeNode
import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return maxDepth(root, 0)
    }

    private fun maxDepth(root: TreeNode?, depth: Int): Int {
        if (root == null) {
            return depth
        }

        return max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1))
    }
}