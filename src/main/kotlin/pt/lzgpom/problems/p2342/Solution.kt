package pt.lzgpom.problems.p2342

class Solution {
    fun maximumSum(nums: IntArray): Int {
        val maxByDigitSum = HashMap<Int, Int>()
        var max = -1

        for (num in nums) {
            val digitSum = digitSum(num)

            val other = maxByDigitSum[digitSum]
            if (other != null) {
                max = maxOf(max, other + num)
                maxByDigitSum[digitSum] = maxOf(num, other)
            } else {
                maxByDigitSum[digitSum] = num
            }
        }

        return max
    }

    private fun digitSum(num: Int): Int {
        var sum = 0
        var current = num

        while (current > 0) {
            sum += current % 10
            current /= 10
        }

        return sum
    }
}