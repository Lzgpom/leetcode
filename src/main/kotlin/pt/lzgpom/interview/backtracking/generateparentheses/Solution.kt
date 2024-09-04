package pt.lzgpom.interview.backtracking.generateparentheses

class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val combinations = mutableListOf<String>()

        fun backtrack(current: String, left: Int, right: Int) {
            if (left == 0 && right == 0) {
                combinations.add(current)
                return
            }

            if (left > 0) {
                backtrack("$current(", left - 1, right)
            }

            if (right > left) {
                backtrack("$current)", left, right - 1)
            }
        }

        backtrack("", n, n)
        return combinations
    }
}