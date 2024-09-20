package pt.lzgpom.interview.heap.findkpairswithsmallestsums

import java.util.*
import kotlin.math.min

class Solution {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val pairs = PriorityQueue<PairSum>(k)
        var maxInPairs = Integer.MAX_VALUE

        for (num1 in nums1) {
            for (num2 in nums2) {
                val sum = num1 + num2

                if (sum < maxInPairs) {
                    pairs.add(PairSum(sum, listOf(num1, num2)))

                    if (pairs.size > k) {
                        val removed = pairs.poll()
                        maxInPairs = min(removed.sum, maxInPairs)
                    }
                } else {
                    break
                }
            }
        }

        return pairs.map { it.pair }
    }

    private class PairSum(val sum: Int, val pair: List<Int>): Comparable<PairSum> {
        override fun compareTo(other: PairSum): Int {
            return other.sum - this.sum
        }
    }
}