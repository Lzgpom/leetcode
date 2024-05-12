package pt.lzgpom.interview.stringarray.removeduplicatesfromsortedarray

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var setPointer = 0

        for (iteratePointer in 1..<nums.size) {
            if (nums[iteratePointer] != nums[setPointer]) {
                setPointer++
                nums[setPointer] = nums[iteratePointer]
            }
        }

        return setPointer + 1
    }
}