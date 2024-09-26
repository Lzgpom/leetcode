package pt.lzgpom.interview.math.sqrt

class Solution {
    fun mySqrt(x: Int): Int {
        var current = 1
        var power = 1

        while (power in 1..<x) {
            current++
            power = current * current
        }

        return if (power > x || power < 0) {
            current - 1
        } else {
            current
        }
    }
}