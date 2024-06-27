package pt.lzgpom.interview.binarytreebfs.binarytreerightsideview

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        val rightSideViewMap = HashMap<Int, Int>()

        fun helper(root: TreeNode?, level: Int) {
            if (root == null) {
                return
            }

            rightSideViewMap[level] = root.`val`
            helper(root.left, level + 1)
            helper(root.right, level + 1)
        }

        helper(root, 0)

        val rightSideView = mutableListOf<Int>()
        var level = 0
        while (rightSideViewMap.contains(level)) {
            rightSideView.add(rightSideViewMap[level]!!)
            level++
        }

        return rightSideView
    }
}