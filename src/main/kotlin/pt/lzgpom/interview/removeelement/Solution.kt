package pt.lzgpom.interview.removeelement

class Solution {
    fun removeElement(nums: IntArray, value: Int): Int {
        var setPointer = 0

        for (iteratePointer in nums.indices) {
            if (nums[iteratePointer] != value) {
                nums[setPointer] = nums[iteratePointer]
                setPointer++
            }
        }

        return setPointer
    }
}