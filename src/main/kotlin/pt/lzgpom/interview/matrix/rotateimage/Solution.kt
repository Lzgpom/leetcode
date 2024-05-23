package pt.lzgpom.interview.matrix.rotateimage

class Solution {
    fun rotate(matrix: Array<IntArray>) {
        for (i in 0 until matrix.size - 1) {
            for (j in i until matrix.size - 1 - i) {
                val temp = matrix[matrix.lastIndex - j][i]
                matrix[matrix.lastIndex - j][i] = matrix[matrix.lastIndex - i][matrix.lastIndex - j]
                matrix[matrix.lastIndex - i][matrix.lastIndex - j] = matrix[j][matrix.lastIndex - i]
                matrix[j][matrix.lastIndex - i] = matrix[i][j]
                matrix[i][j] = temp
            }
        }
    }
}