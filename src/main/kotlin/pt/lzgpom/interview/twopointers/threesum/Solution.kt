package pt.lzgpom.interview.twopointers.threesum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sums = ArrayList<List<Int>>()
        nums.sort()

        for (firstIndex in nums.indices) {
            val isSameAsPrevious = firstIndex > 0 && nums[firstIndex] == nums[firstIndex - 1]

            if (isSameAsPrevious) {
                continue
            }

            var secondIndex = firstIndex + 1
            var thirdIndex = nums.lastIndex

            while (secondIndex < thirdIndex) {
                val total = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]

                if (total > 0) {
                    thirdIndex--
                } else if (total < 0) {
                    secondIndex++
                } else {
                    sums.add(listOf(nums[firstIndex], nums[secondIndex], nums[thirdIndex]))
                    secondIndex++

                    while (nums[secondIndex] == nums[secondIndex - 1] && secondIndex < thirdIndex) {
                        secondIndex++
                    }
                }
            }
        }

        return sums
    }
}
