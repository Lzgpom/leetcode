package pt.lzgpom.interview.binarytreegeneral.sumroottoleafnumbers

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun sumNumbers(root: TreeNode?): Int {
        var sum = 0

        fun helper(root: TreeNode?, currentVal: Int) {
            if (root == null) {
                return
            }

            val newVal = currentVal * 10 + root.`val`
            if ((root.left == null && root.right == null)) {
                sum += newVal
                return
            }

            helper(root.left, newVal)
            helper(root.right, newVal)
        }

        helper(root, 0)
        return sum
    }
}