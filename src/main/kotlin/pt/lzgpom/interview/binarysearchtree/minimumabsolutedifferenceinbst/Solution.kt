package pt.lzgpom.interview.binarysearchtree.minimumabsolutedifferenceinbst

import pt.lzgpom.interview.binarytreegeneral.TreeNode
import kotlin.math.min

class Solution {
    fun getMinimumDifference(root: TreeNode?): Int {
        var minimum = Int.MAX_VALUE
        var prev: TreeNode? = null

        fun helper(root: TreeNode?) {
            if (root == null) {
                return
            }

            helper(root.left)

            if (prev != null) {
                minimum = min(minimum, root.`val` - prev!!.`val`)
            }

            prev = root

            helper(root.right)
        }

        helper(root)

        return minimum
    }
}