package pt.lzgpom.interview.math.plusone

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = true
        var index = digits.lastIndex

        while (carry) {
            if (index < 0) {
                val increaseArray = digits.grow()
                increaseArray[0] = 1
                return increaseArray
            }

            val digit = digits[index] + 1
            if (digit == 10) {
                digits[index] = 0
            } else {
                digits[index] = digit
                carry = false
            }

            index--
        }

        return digits
    }

    private fun IntArray.grow(): IntArray {
        val new = IntArray(this.size + 1)

        for (i in this.indices) {
            new[i + 1] = this[i]
        }

        return new
    }
}