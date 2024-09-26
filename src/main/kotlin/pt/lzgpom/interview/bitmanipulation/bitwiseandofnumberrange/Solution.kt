package pt.lzgpom.interview.bitmanipulation.bitwiseandofnumberrange

class Solution {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var found = false
        var value = 0
        var bit = 1 shl 31

        for (i in 0 until 32) {
            val leftBit = bit and left
            val rightBit = bit and right

            if (!found && rightBit != 0) {
                found = true
            }

            if (leftBit == rightBit) {
                value = leftBit or value
            } else if (found) {
                return value
            }

            bit = bit ushr 1
        }

        return value
    }
}