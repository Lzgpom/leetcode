package pt.lzgpom.interview.backtracking.combinationsum

import java.util.*

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val combinations = mutableListOf<List<Int>>()
        val candidatesSorted = candidates.sorted()

        fun combination(start: Int, current: LinkedList<Int>, sum: Int) {
            if (sum == target) {
                combinations.add(current.toList())
                return
            }
            if (sum > target) {
                return
            }

            for (i in (start..candidatesSorted.lastIndex)) {
                val candidate = candidatesSorted[i]
                current.addLast(candidate)
                combination(i, current, sum + candidate)
                current.removeLast()
            }
        }

        combination(0, LinkedList(), 0)
        return combinations
    }
}