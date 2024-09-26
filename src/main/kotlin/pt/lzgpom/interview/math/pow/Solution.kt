package pt.lzgpom.interview.math.pow

class Solution {
    fun myPow(x: Double, n: Int): Double {
        if (n == 0 || x == 1.0) {
            return 1.0
        }

        if (x == -1.0) {
            if (n % 2 == 0) {
                return 1.0
            }

            return -1.0
        }

        if (n == Int.MIN_VALUE) {
            return 0.0
        }

        var x = x
        var exp = n.toLong()
        if (n < 0) {
            x = 1 / x
            exp = -exp
        }

        var result = 1.0
        while (exp > 0) {
            if ((exp % 2) == 1L) {
                result *= x
            }
            x *= x
            exp /= 2
        }

        return result
    }
}