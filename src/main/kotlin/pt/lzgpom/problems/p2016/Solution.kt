package pt.lzgpom.problems.p2016

class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var max = -1

        for (i in nums.indices) {
            for (j in i + 1 .. nums.lastIndex) {
                if(nums[j] > nums[i]) {
                    max = maxOf(nums[j] - nums[i], max)
                }
            }
        }

        return max
    }
}