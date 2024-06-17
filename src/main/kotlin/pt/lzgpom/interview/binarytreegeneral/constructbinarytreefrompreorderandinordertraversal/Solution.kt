package pt.lzgpom.interview.binarytreegeneral.constructbinarytreefrompreorderandinordertraversal

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val inIndexes = inorder.mapIndexed { index, i ->  i to index}.toMap()

        fun helper(preStart: Int, inStart: Int, inEnd: Int): TreeNode? {
            if (preStart >= preorder.size || inStart > inEnd) {
                return null
            }

            val root = TreeNode(preorder[preStart])
            val inIndex = inIndexes[root.`val`]!!

            root.left = helper(preStart + 1, inStart, inIndex - 1)
            root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd)
            return root
        }

        return helper(0, 0, inorder.lastIndex)
    }
}