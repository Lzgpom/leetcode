package pt.lzgpom.interview.binarysearch.searchinsertposition

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        tailrec fun searchWithBounds(start: Int, end: Int): Int {
            if (start >= end) {
                return if (nums[start] >= target){
                    start
                } else {
                    start + 1
                }
            }

            val size = end - start
            val middle = start + (size / 2)

            return if (nums[middle] == target) {
                middle
            } else if (nums[middle] < target) {
                searchWithBounds(middle + 1, end)
            } else {
                searchWithBounds(start, middle - 1)
            }

        }

        return searchWithBounds(0, nums.lastIndex)
    }
}