package pt.lzgpom.interview.matrix.setmatrixzeroes

class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
        val zeroInFirstRow = matrix[0].any { it == 0 }
        val zeroInFirstColumn = matrix.any { it[0] == 0 }

        for (row in 1 until matrix.size) {
            for (column in 1 until matrix[row].size) {
                if (matrix[row][column] == 0) {
                    matrix[row][0] = 0
                    matrix[0][column] = 0
                }
            }
        }

        for (row in 1 until matrix.size) {
            for (column in 1 until matrix[row].size) {
                if (matrix[row][0] == 0 || matrix[0][column] == 0) {
                    matrix[row][column] = 0
                }
            }
        }

        if (zeroInFirstRow) {
            for (i in matrix[0].indices) {
                matrix[0][i] = 0
            }
        }

        if (zeroInFirstColumn) {
            for (i in matrix.indices) {
                matrix[i][0] = 0
            }
        }
    }
}