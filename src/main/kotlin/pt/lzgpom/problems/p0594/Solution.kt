package pt.lzgpom.problems.p0594

class Solution {
    fun findLHS(nums: IntArray): Int {
        val numCount = HashMap<Int, Int>()
        nums.forEach { numCount.merge(it, 1, Int::plus) }

        return numCount.entries
            .map {
                val next = numCount[it.key + 1]
                return@map if (next != null) {
                    it.value + next
                } else {
                    0
                }
            }
            .max()
    }
}