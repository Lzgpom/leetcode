package pt.lzgpom.interview.math.factorialtrailingzeroes

class Solution {
    fun trailingZeroes(n: Int): Int {
        if (n == 0) {
            return 0
        }

        val division = n / 5
        return division + trailingZeroes(division)
    }
}