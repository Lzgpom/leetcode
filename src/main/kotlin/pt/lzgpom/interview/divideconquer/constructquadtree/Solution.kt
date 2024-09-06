package pt.lzgpom.interview.divideconquer.constructquadtree

class Solution {
    fun construct(grid: Array<IntArray>): Node? {
        if (grid.isEmpty()) {
            return null
        }

        return construct(grid, 0, 0, grid.size)
    }

    private fun construct(grid: Array<IntArray>, x: Int, y: Int, size: Int): Node {
        if (size == 1) {
            return Node(grid[x][y].toBoolean(), true)
        }

        val newSize = size / 2
        val topLeft = construct(grid, x, y, newSize)
        val topRight = construct(grid, x, y + newSize, newSize)
        val bottomLeft = construct(grid, x + newSize, y, newSize)
        val bottomRight = construct(grid, x + newSize, y + newSize, newSize)

        val isAllLeaf = topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
        val isAllValuesSame = topLeft.`val` == topRight.`val` && topRight.`val` == bottomLeft.`val` && bottomLeft.`val` == bottomRight.`val`

        if (isAllLeaf && isAllValuesSame) {
            return Node(topLeft.`val`, true)
        }

        val node = Node(`val` = true, isLeaf = false)
        node.topLeft =  topLeft
        node.topRight = topRight
        node.bottomLeft = bottomLeft
        node.bottomRight = bottomRight

        return node
    }

    private fun Int.toBoolean(): Boolean {
        return this == 1
    }
}