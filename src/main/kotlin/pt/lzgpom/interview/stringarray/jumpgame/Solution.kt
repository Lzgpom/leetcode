package pt.lzgpom.interview.stringarray.jumpgame

class Solution {
    fun canJump(nums: IntArray): Boolean {
        var currentPosition = nums.lastIndex

        for (i in nums.lastIndex downTo 0) {
            if(nums[i] >= currentPosition - i) {
                currentPosition = i
            }
        }

        return currentPosition == 0
    }
}