package pt.lzgpom.interview.hashmap.containsduplicate2

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seen = HashSet<Int>()

        for (i in nums.indices) {
            val indexToRemove = i - k - 1

            if (indexToRemove >= 0) {
                seen.remove(nums[indexToRemove])
            }

            if (seen.contains(nums[i])) {
                return true
            } else {
                seen.add(nums[i])
            }
        }

        return false
    }
}