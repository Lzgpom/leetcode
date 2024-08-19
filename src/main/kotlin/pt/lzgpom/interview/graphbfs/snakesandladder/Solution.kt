package pt.lzgpom.interview.graphbfs.snakesandladder

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun snakesAndLadders(board: Array<IntArray>): Int {
        val size = board.size * board.size
        val visited = BooleanArray(size) { false }

        val queue: Queue<IntArray> = LinkedList()
        queue.add(intArrayOf(1, 0))
        visited[0] = true

        while (queue.isNotEmpty()) {
            val (position, steps) = queue.poll()
            println(queue.map { it.contentToString() })

            if (position + DICE_SIZE >= size) {
                return steps + 1
            }

            for (next in position + 1 .. position + DICE_SIZE) {
                val actualNext = transverseSnakeOrLadderIfNeeded(next, board, visited)

                if (actualNext == size) {
                    return steps + 1
                }

                if (actualNext != -1) {
                    queue.add(intArrayOf(actualNext, steps + 1))
                }
            }
        }

        return -1
    }

    private fun transverseSnakeOrLadderIfNeeded(position: Int, board: Array<IntArray>, visited: BooleanArray): Int {
        val positionIndex = position - 1
        val (col, row) = positionToCoordinates(position, board.size)

        if (visited[positionIndex]) {
            return -1
        }

        visited[positionIndex] = true

        if (board[col][row] == -1) {
            return position
        }

        return board[col][row]
    }

    private fun positionToCoordinates(position: Int, rowSize: Int): IntArray {
        val index = position - 1
        val column = index / rowSize
        val invertedColumn = rowSize - column - 1
        val row = index % rowSize

        if (column % 2 == 0) {
           return intArrayOf(invertedColumn, row)
        }

        return intArrayOf(invertedColumn, rowSize - row - 1)
    }

    companion object {
        const val DICE_SIZE = 6
    }
}