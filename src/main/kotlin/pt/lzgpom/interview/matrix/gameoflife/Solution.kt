package pt.lzgpom.interview.matrix.gameoflife

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun gameOfLife(board: Array<IntArray>) {
        for (x in board.indices) {
            for (y in board[x].indices) {
                val aliveNeighbours = calculateAliveNeighbours(board, x, y)
                val isAlive = board[x][y] == 1
                val isGoingToBeAlive = isGoingToBeAlive(aliveNeighbours, isAlive)

                if (isAlive) {
                    if(isGoingToBeAlive) {
                        board[x][y] = 2
                    } else {
                        board[x][y] = 1
                    }
                } else {
                    if(isGoingToBeAlive) {
                        board[x][y] = -2
                    } else {
                        board[x][y] = -1
                    }
                }
            }
        }

        for (x in board.indices) {
            for (y in board[x].indices) {
                val state = abs(board[x][y])
                board[x][y] = when (state) {
                    1 -> 0
                    else -> 1
                }
            }
        }
    }

    private fun calculateAliveNeighbours(board: Array<IntArray>, x: Int, y: Int): Int {
        val minX = max(0, x - 1)
        val minY = max(0, y - 1)
        val maxX = min(board.lastIndex, x + 1)
        val maxY = min(board[0].lastIndex, y + 1)

        var count = 0
        for (i in minX..maxX) {
            for (j in minY..maxY) {
                if (board[i][j] > 0 && !(x == i && y == j)) {
                    count++
                }
            }
        }

        return count
    }

    private fun isGoingToBeAlive(aliveNeighbours: Int, currentState: Boolean): Boolean {
        return if (aliveNeighbours < 2) {
            false
        } else if (aliveNeighbours > 3) {
            false
        } else if (aliveNeighbours == 3) {
            true
        } else {
            currentState
        }
    }
}