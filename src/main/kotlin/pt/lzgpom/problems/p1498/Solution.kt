package pt.lzgpom.problems.p1498

class Solution {
    fun numSubseq(nums: IntArray, target: Int): Int {
        val sorted = nums.sorted()
        var left = 0
        var right = sorted.lastIndex
        var result = 0

        while (left <= right) {
            if (sorted[right] + sorted[left] > target) {
                right--
            } else {
                result = (result + (1 shl (right - left))) % MODULO
                left++
            }
        }

        return result
    }

    companion object {
        const val MODULO = 1000000007
    }
}