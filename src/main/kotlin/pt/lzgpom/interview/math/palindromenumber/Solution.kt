package pt.lzgpom.interview.math.palindromenumber

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        var temp = x
        var inverted = 0

        while (temp > 0) {
            val digit = temp % 10
            inverted = (inverted * 10) + digit

            temp /= 10
        }

        return x == inverted
    }
}