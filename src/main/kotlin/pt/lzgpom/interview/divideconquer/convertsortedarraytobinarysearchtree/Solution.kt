package pt.lzgpom.interview.divideconquer.convertsortedarraytobinarysearchtree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) {
            return null
        }

        return sortedArrayToBST(nums, 0, nums.lastIndex)
    }

    private fun sortedArrayToBST(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) {
            return null
        }

        val middle = (end - start) / 2 + start

        val node = TreeNode(nums[middle])
        node.left = sortedArrayToBST(nums, start, middle - 1)
        node.right = sortedArrayToBST(nums, middle + 1, end)

        return node
    }
}