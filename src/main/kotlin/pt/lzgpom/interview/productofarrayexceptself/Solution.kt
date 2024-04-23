package pt.lzgpom.interview.productofarrayexceptself

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val lefts = IntArray(nums.size)
        val rights = IntArray(nums.size)

        lefts[0] = 1
        for (i in 0 until nums.lastIndex) {
            lefts[i + 1] = lefts[i] * nums[i]
        }

        rights[rights.lastIndex] = 1
        for (i in nums.lastIndex downTo 1) {
            rights[i - 1] = rights[i] * nums[i]
        }

        for (i in nums.indices) {
            nums[i] = lefts[i] * rights[i]
        }

        return nums
    }

    /**
     * After reading solutions
     */
    fun productExceptSelf2(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)

        var current = 1
        for (i in nums.indices) {
            ans[i] = current
            current *= nums[i]
        }

        current = 1
        for (i in nums.lastIndex downTo 0) {
            ans[i] *= current
            current *= nums[i]
        }

        return ans
    }
}
