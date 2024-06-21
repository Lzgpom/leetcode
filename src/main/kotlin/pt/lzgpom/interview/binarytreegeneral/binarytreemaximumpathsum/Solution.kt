package pt.lzgpom.interview.binarytreegeneral.binarytreemaximumpathsum

import pt.lzgpom.interview.binarytreegeneral.TreeNode
import kotlin.math.max

class Solution {
    fun maxPathSum(root: TreeNode?): Int {
        var result = Int.MIN_VALUE

        fun helper(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }

            val left = helper(root.left)
            val right = helper(root.right)

            val leftPath = root.`val` + left
            val rightPath = root.`val` + right
            val completePath = root.`val` + left + right

            val maxOnCurrentPath = maxOfValues(leftPath, rightPath, root.`val`)

            result = maxOfValues(result, maxOnCurrentPath, completePath)

            return maxOnCurrentPath
        }

        helper(root)
        return result
    }

    private fun maxOfValues(vararg values: Int): Int {
        var max = Int.MIN_VALUE

        for (value in values) {
            max = max(max, value)
        }

        return max
    }
}