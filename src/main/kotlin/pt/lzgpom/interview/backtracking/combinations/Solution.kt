package pt.lzgpom.interview.backtracking.combinations

class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val combinations = ArrayList<List<Int>>()

        fun aux(start: Int, left: Int, combination: List<Int>) {
            if (left == 0) {
                combinations.add(combination)
                return
            }

            for (i in (start ..n)) {
                aux(i + 1, left - 1, combination + i)
            }
        }

        aux(1, k, emptyList())
        return combinations
    }
}