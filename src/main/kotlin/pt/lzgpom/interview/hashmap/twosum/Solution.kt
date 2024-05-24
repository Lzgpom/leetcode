package pt.lzgpom.interview.hashmap.twosum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsIndex = HashMap<Int, Int>()

        for (i in nums.indices) {
            val needed = target - nums[i]

            val otherIndex = numsIndex[needed]
            if (otherIndex != null) {
                return intArrayOf(otherIndex, i)
            }

            numsIndex[nums[i]] = i
        }

        return intArrayOf()
    }
}