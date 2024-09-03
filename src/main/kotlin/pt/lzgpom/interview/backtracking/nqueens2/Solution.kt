package pt.lzgpom.interview.backtracking.nqueens2

class Solution {
    fun totalNQueens(n: Int): Int {
        val board = Array(n) { BooleanArray(n) }
        var count = 0

        fun backtrack(row: Int, column: Int, remaining: Int) {
            val nextPosition = board.nextPosition(row, column)

            if (board.isRowFree(row) &&
                board.isColumnFree(column) &&
                board.areDiagonalsFree(row, column)
            ) {

                val newRemaining = remaining - 1
                if (newRemaining == 0) {
                    count++
                } else if (nextPosition != null) {
                    val (nextRow, nextColumn) = nextPosition

                    board[row][column] = true
                    backtrack(nextRow, nextColumn, newRemaining)
                    board[row][column] = false
                }
            }
            if (nextPosition != null) {
                val (nextRow, nextColumn) = nextPosition
                backtrack(nextRow, nextColumn, remaining)
            }
        }

        backtrack(0, 0, n)
        return count
    }

    private fun Array<BooleanArray>.isRowFree(row: Int): Boolean {
        return !this[row].any { it }
    }

    private fun Array<BooleanArray>.isColumnFree(column: Int): Boolean {
        return !this.any { it[column] }
    }

    private fun Array<BooleanArray>.areDiagonalsFree(row: Int, column: Int): Boolean {
        var i = row
        var j = column
        while (i >= 0 && j >= 0) {
            if (this[i][j]) {
                return false
            }
            i--
            j--
        }

        i = row + 1
        j = column + 1
        while (i < size && j < size) {
            if (this[i][j]) {
                return false
            }
            i++
            j++
        }

        i = row
        j = column
        while (i < size && j >= 0) {
            if (this[i][j]) {
                return false
            }
            i++
            j--
        }

        i = row - 1
        j = column + 1
        while (i >= 0 && j < size) {
            if (this[i][j]) {
                return false
            }
            i--
            j++
        }

        return true
    }

    private fun Array<BooleanArray>.nextPosition(row: Int, column: Int): Pair<Int, Int>? {
        val nextPosition = row * this.size + column + 1
        if (nextPosition >= this.size * this.size) {
            return null
        }

        val nextRow = nextPosition / this.size
        val nextColumn = nextPosition % this.size

        return nextRow to nextColumn
    }
}