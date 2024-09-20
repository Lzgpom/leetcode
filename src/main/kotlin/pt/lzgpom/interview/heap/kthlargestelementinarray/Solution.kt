package pt.lzgpom.interview.heap.kthlargestelementinarray

import java.util.PriorityQueue

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val queue = PriorityQueue<Int>(k)

        for (num in nums) {
            queue.add(num)

            if (queue.size > k) {
                queue.poll()
            }
        }

        return queue.poll()
    }
}