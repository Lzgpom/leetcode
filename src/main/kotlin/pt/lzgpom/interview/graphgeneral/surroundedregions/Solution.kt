package pt.lzgpom.interview.graphgeneral.surroundedregions

class Solution {
    fun solve(board: Array<CharArray>) {
        fun markNodesThatCantBeSurrounded(x: Int, y: Int) {
            if (!isInbounds(board, x, y) || board[x][y] != TO_BE_SURROUNDED_CHAR) {
                return
            }

            board[x][y] = TEMP_CHAR
            markNodesThatCantBeSurrounded(x + 1, y)
            markNodesThatCantBeSurrounded(x - 1, y)
            markNodesThatCantBeSurrounded(x, y + 1)
            markNodesThatCantBeSurrounded(x, y - 1)
        }

        for (x in board.indices) {
            markNodesThatCantBeSurrounded(x, 0)
            markNodesThatCantBeSurrounded(x, board[0].lastIndex)
        }

        for (y in board[0].indices) {
            markNodesThatCantBeSurrounded(0, y)
            markNodesThatCantBeSurrounded(board.lastIndex, y)
        }

        for (x in board.indices) {
            for (y in board[x].indices) {
                if (board[x][y] == SURROUNDING_CHAR) {
                    board[x][y] = SURROUNDING_CHAR
                } else if (board[x][y] == TEMP_CHAR) {
                    board[x][y] = SURROUNDING_CHAR
                }
            }
        }
    }

    private fun isInbounds(board: Array<CharArray>, x: Int, y: Int) =
        x in board.indices && y in board[x].indices

    companion object {
        private const val SURROUNDING_CHAR = 'X'
        private const val TO_BE_SURROUNDED_CHAR = 'O'
        private const val TEMP_CHAR = 'A'
    }
}