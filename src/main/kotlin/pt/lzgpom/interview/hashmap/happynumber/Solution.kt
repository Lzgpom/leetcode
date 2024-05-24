package pt.lzgpom.interview.hashmap.happynumber

class Solution {
    fun isHappy(n: Int): Boolean {
        val visited = HashSet<Int>()
        var number = n

        while (number != 1) {
            if (visited.contains(number)) {
                return false
            }

            visited.add(number)
            number = sumOfSquareOfDigits(number)
        }

        return true
    }

    private fun sumOfSquareOfDigits(input: Int): Int {
        var sum = 0
        var n = input

        while (n != 0) {
            val digit = n % 10
            sum += digit * digit
            n /= 10
        }

        return sum
    }
}