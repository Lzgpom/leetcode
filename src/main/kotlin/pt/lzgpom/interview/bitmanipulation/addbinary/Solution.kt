package pt.lzgpom.interview.bitmanipulation.addbinary

class Solution {
    fun addBinary(a: String, b: String): String {
        var aIndex = a.lastIndex
        var bIndex = b.lastIndex
        var carry = 0

        val result = StringBuilder()
        while (aIndex >= 0 || bIndex >= 0 || carry == 1) {
            if (aIndex >= 0) {
                carry += a[aIndex] - '0'
                aIndex--
            }
            if (bIndex >= 0) {
                carry += b[bIndex] - '0'
                bIndex--
            }

            result.append(carry % 2)
            carry /= 2
        }

        return result.toString().reversed()
    }
}