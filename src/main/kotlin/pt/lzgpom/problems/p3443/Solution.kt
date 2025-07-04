package pt.lzgpom.problems.p3443

import kotlin.math.abs

class Solution {
    fun maxDistance(s: String, k: Int): Int {
        val moves = Moves()
        var max = 0

        for (move in s) {
            when (move) {
                'N' -> moves.north++
                'S' -> moves.south++
                'W' -> moves.west++
                'E' -> moves.east++
            }

            val optimized = moves.optimize(k).distance()
            max = maxOf(optimized, max)
        }

        return max
    }

    data class Moves(
        var north: Int = 0,
        var south: Int = 0,
        var east: Int = 0,
        var west: Int = 0
    ) {
        fun optimize(k: Int): Moves {
            val optimized = this.copy()
            var changes = k

            if (optimized.north >= optimized.south) {
                if (optimized.south <= changes) {
                    changes -= optimized.south
                    optimized.north += optimized.south
                    optimized.south = 0
                } else {
                    optimized.north += changes
                    optimized.south -= changes
                    changes = 0
                }
            } else {
                if (optimized.north <= changes) {
                    changes -= optimized.north
                    optimized.south += optimized.north
                    optimized.north = 0
                } else {
                    optimized.south += changes
                    optimized.north -= changes
                    changes = 0
                }
            }

            if (optimized.east >= optimized.west) {
                if (optimized.west <= changes) {
                    optimized.east += optimized.west
                    optimized.west = 0
                } else {
                    optimized.east += changes
                    optimized.west -= changes
                }
            } else {
                if (optimized.east <= changes) {
                    optimized.west += optimized.east
                    optimized.east = 0
                } else {
                    optimized.west += changes
                    optimized.east -= changes
                }
            }

            return optimized
        }

        fun distance(): Int {
            return abs(north - south) + abs(east - west)
        }
    }
}