package pt.lzgpom.interview.removeduplicatesfromsortedarray2

class Solution {
    private val MAX_SAME_COUNT = 2

    fun removeDuplicates(nums: IntArray): Int {
        var setPointer = 0
        var sameNumCount = 0

        for (iteratePointer in 1..<nums.size) {
            if (nums[iteratePointer] != nums[setPointer]) {
                setPointer++
                nums[setPointer] = nums[iteratePointer]
                sameNumCount = 0
            } else {
                sameNumCount++

                if (sameNumCount < MAX_SAME_COUNT) {
                    setPointer++
                    nums[setPointer] = nums[iteratePointer]
                }
            }
        }

        return setPointer + 1
    }
}