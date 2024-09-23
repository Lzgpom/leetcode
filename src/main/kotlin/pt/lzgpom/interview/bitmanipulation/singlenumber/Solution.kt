package pt.lzgpom.interview.bitmanipulation.singlenumber

class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums.fold(0) { acc, num -> acc xor num }
    }
}