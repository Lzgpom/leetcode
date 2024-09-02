package pt.lzgpom.interview.backtracking.permutations

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val permutations = ArrayList<List<Int>>()

        fun permute(taken: MutableSet<Int>, current: List<Int>) {
            if (taken.size == nums.size) {
                permutations.add(current)
                return
            }

            for (num in nums.filter { !taken.contains(it) }) {
                taken.add(num)
                permute(taken, current + num)
                taken.remove(num)
            }
        }

        permute(HashSet(), emptyList())

        return permutations
    }
}