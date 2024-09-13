package pt.lzgpom.interview.binarysearch.searcha2dmatrix

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var start = 0
        var end = matrix.size * matrix[0].size - 1

        while (start <= end) {
            val middle = start + ((end - start) / 2)
            val middleValue = matrix.valueAtIndex(middle)

            if (middleValue == target) {
                return true
            } else if (middleValue < target) {
                start = middle + 1
            } else {
                end = middle - 1
            }
        }

        return false
    }

    private fun Array<IntArray>.valueAtIndex(index: Int): Int {
        val x = index / this[0].size
        val y = index % this[0].size
        return this[x][y]
    }
}