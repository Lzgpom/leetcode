package pt.lzgpom.interview.matrix.validsoduku

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array<MutableSet<Char>>(9) { HashSet() }
        val columns = Array<MutableSet<Char>>(9) { HashSet() }
        val squares = Array<MutableSet<Char>>(9) { HashSet() }

        for (i in board.indices) {
            for (j in board[i].indices) {
                val number = board[i][j]

                if (number == '.') {
                    continue
                }

                val row = rows[i]
                val column = columns[j]
                val square = squares[(i / 3) + ((j / 3) * 3)]
                val groups = arrayOf(row, column, square)

                for (group in groups) {
                    if (group.contains(number)) {
                        return false
                    }

                    group.add(number)
                }
            }
        }

        return true
    }
}