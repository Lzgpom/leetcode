package pt.lzgpom.problems.p2016

class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var result = -1
        var min = Int.MAX_VALUE
        for (num in nums) {
            if (num > min) {
                result = maxOf(result, num - min)
            } else {
                min = num
            }
        }

        return result
    }
}