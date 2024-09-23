package pt.lzgpom.interview.bitmanipulation.numberofonebits

class Solution {
    fun hammingWeight(n: Int): Int {
        var num = n
        var count = 0

        while (num != 0) {
            count += num and 1
            num = num shr 1
        }

        return count
    }
}