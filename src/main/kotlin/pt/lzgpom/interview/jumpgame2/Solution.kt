package pt.lzgpom.interview.jumpgame2

import java.util.LinkedList
import java.util.Queue
import kotlin.math.max

data class Position(val pos: Int, val jumps: Int)

class Solution {

    fun jump(nums: IntArray): Int {
        if (nums.size <= 1) {
            return 0
        }

        val visited = BooleanArray(nums.size)

        val queue: Queue<Position> = LinkedList()
        queue.add(Position(0, 0))
        visited[0] = true

        while (queue.isNotEmpty()) {
            val position = queue.poll()
            val maxJump = nums[position.pos] + position.pos

            if (maxJump >= nums.lastIndex) {
                return position.jumps + 1
            }

            for (currentJump in 1..nums[position.pos]) {
                val newPosition = position.pos + currentJump
                if (!visited[newPosition]) {
                    val totalJumps = position.jumps + 1

                    visited[newPosition] = true
                    queue.add(Position(newPosition, totalJumps))
                }
            }
        }

        return -1
    }

    fun jump2(nums: IntArray): Int {
        var jumps = 0
        var currentEnd = 0
        var currentFarthest = 0

        for (i in 0..<nums.size - 1) {
            currentFarthest = max(nums[i] + i, currentFarthest)

            if (i == currentEnd) {
                jumps++
                currentEnd = currentFarthest
            }
        }

        return jumps
    }
}