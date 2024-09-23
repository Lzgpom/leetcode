package pt.lzgpom.interview.bitmanipulation.reversebits

class Solution {
    fun reverseBits(n: Int): Int {
        var num = n
        var result = 0

        for (i in 0 until 32) {
            result = result shl 1
            result = result or (num and 1)
            num = num shr 1
        }

        return result
    }
}