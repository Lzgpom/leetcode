package pt.lzgpom.interview.heap.findsubsequenceoflengthkwiththelargestsum

import java.util.PriorityQueue

class Solution {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        val highestNumWithIndexQueue = PriorityQueue<Pair<Int, Int>> { o1, o2 -> o1.first.compareTo(o2.first) }
        for ((index, num) in nums.withIndex()) {
            highestNumWithIndexQueue.offer(num to index)

            if (highestNumWithIndexQueue.size > k) {
                highestNumWithIndexQueue.poll()
            }
        }

        return highestNumWithIndexQueue
            .sortedBy { it.second }
            .map { it.first }
            .toIntArray()
    }
}