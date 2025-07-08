package pt.lzgpom.problems.p3442

class Solution {
    fun maxDifference(s: String): Int {
        val counts = s.groupingBy { it }.eachCount().map { it.value }.sorted()

        val max = counts.last { it.odd() }
        val min = counts.first { !it.odd() }
        return max - min
    }

    private fun Int.odd(): Boolean {
        return this % 2 == 1
    }
}