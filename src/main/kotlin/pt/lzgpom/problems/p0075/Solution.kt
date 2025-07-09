package pt.lzgpom.problems.p0075

class Solution {
    fun sortColors(nums: IntArray) {
        val counts = IntArray(3)

        for (num in nums) {
            counts[num]++
        }

        var i = 0
        for (color in counts.indices) {
            for (j in 0 until counts[color]) {
                nums[i] = color
                i++
            }
        }
    }
}