package pt.lzgpom.interview.matrix.spiralmatrix

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val totalCount = matrix.size * matrix[0].size
        val items = mutableListOf<Int>()

        var rowMin = 1
        var rowMax = matrix.lastIndex
        var columnMin = 0
        var columnMax = matrix[0].lastIndex

        var row = 0
        var column = 0

        while (items.size < totalCount) {
            for (i in columnMin..columnMax) {
                column = i
                items.add(matrix[row][column])
            }

            columnMax--

            if (rowMin > rowMax) {
                break
            }

            for (i in rowMin..rowMax) {
                row = i
                items.add(matrix[row][column])
            }

            rowMax--

            if (columnMin > columnMax) {
                break
            }

            for (i in columnMax downTo columnMin) {
                column = i
                items.add(matrix[row][column])
            }

            columnMin++

            for (i in rowMax downTo rowMin) {
                row = i
                items.add(matrix[row][column])
            }

            rowMin++
        }

        return items
    }
}