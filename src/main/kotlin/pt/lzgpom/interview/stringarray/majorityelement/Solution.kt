package pt.lzgpom.interview.stringarray.majorityelement

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var counter = 0
        var currentNumber = nums[0]

        for (i in nums.indices) {
            if (nums[i] == currentNumber) {
                counter++
            } else {
                counter--

                if (counter <= 0) {
                    currentNumber = nums[i]
                    counter = 1
                }
            }
        }


        return currentNumber
    }
}