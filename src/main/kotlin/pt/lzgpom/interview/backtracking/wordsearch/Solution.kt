package pt.lzgpom.interview.backtracking.wordsearch

class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        fun checkWordStartingInPosition(x: Int, y: Int, index: Int): Boolean {
            if (!board.isInbound(x, y)) {
                return false
            }

            if (word[index] == board[x][y]) {
                if (index == word.lastIndex) {
                    return true
                }
            } else {
                return false
            }

            board[x][y] = '.'

            val result = checkWordStartingInPosition(x + 1, y, index + 1) ||
                    checkWordStartingInPosition(x - 1, y, index + 1) ||
                    checkWordStartingInPosition(x, y + 1, index + 1) ||
                    checkWordStartingInPosition(x, y - 1, index + 1)

            board[x][y] = word[index]

            return result
        }

        for (x in board.indices) {
            for (y in board[x].indices) {
                if (checkWordStartingInPosition(x, y, 0)) {
                    return true
                }
            }
        }

        return false
    }

    private fun Array<CharArray>.isInbound(x: Int, y: Int): Boolean {
        return x in this.indices && y in this[x].indices
    }
}