package pt.lzgpom.interview.binarytreebfs.averageoflevelsinbinarytree

import pt.lzgpom.interview.binarytreegeneral.TreeNode

class Solution {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val nodesInLevels = HashMap<Int, Int>()
        val sumOfNodesInLevels = HashMap<Int, Double>()

        fun helper(root: TreeNode?, level: Int) {
            if (root == null) {
                return
            }

            nodesInLevels.merge(level, 1, Int::plus)
            sumOfNodesInLevels.merge(level, root.`val`.toDouble(), Double::plus)

            helper(root.left, level + 1)
            helper(root.right, level + 1)
        }

        helper(root, 0)

        val averages = mutableListOf<Double>()
        var level = 0
        while (nodesInLevels.contains(level)) {
            val average: Double = sumOfNodesInLevels[level]!! / nodesInLevels[level]!!
            averages.add(average)
            level++
        }

        return averages.toDoubleArray()
    }
}