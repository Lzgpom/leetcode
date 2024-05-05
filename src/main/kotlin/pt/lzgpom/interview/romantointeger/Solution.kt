package pt.lzgpom.interview.romantointeger

class Solution {
    private val SYMBOL_VALUE: Map<Char, Int> = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var total = 0
        var highest = 0

        for (i in s.lastIndex downTo 0) {
            val value = SYMBOL_VALUE[s[i]]!!

            if (value < highest) {
                total -= value
            } else {
                total += value
                highest = value
            }
        }

        return total
    }
}