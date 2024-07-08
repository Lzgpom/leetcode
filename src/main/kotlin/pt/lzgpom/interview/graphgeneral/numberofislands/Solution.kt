package pt.lzgpom.interview.graphgeneral.numberofislands

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        fun removeIsland(x: Int, y: Int) {
            if (!grid.isLand(x, y)) {
                return
            }

            grid[x][y] = '0'

            removeIsland(x, y + 1)
            removeIsland(x, y - 1)
            removeIsland(x + 1, y)
            removeIsland(x - 1, y)
        }

        var count = 0

        for (x in grid.indices) {
            for (y in grid[x].indices) {
                if (grid.isLand(x, y)) {
                    count++
                    removeIsland(x, y)
                }
            }
        }

        return count
    }

    private fun Array<CharArray>.isLand(x: Int, y: Int) =
        x in this.indices && y in this[x].indices && this[x][y] == '1'
}