package pt.lzgpom.interview.binarytreegeneral.constructbinarytreefrominorderandpostordertraversal

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        val inIndexes = inorder.mapIndexed { index, i -> i to index }.toMap()

        fun helper(postEnd: Int, inStart: Int, inEnd: Int): TreeNode? {
            if (postEnd < 0 || inStart > inEnd) {
                return null
            }

            val root = TreeNode(postorder[postEnd])
            val inIndex = inIndexes[root.`val`]!!

            root.left = helper(postEnd + inIndex - inEnd - 1, inStart, inIndex - 1)
            root.right = helper(postEnd - 1, inIndex + 1, inEnd)

            return root
        }

        return helper(postorder.lastIndex, 0, inorder.lastIndex)
    }
}