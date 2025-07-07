package pt.lzgpom.problems.p1394

class Solution {
    fun findLucky(arr: IntArray): Int {
        val counts = HashMap<Int, Int>()

        for (num in arr) {
            counts.merge(num, 1, Int::plus)
        }

        var lucky = -1
        for ((num, count) in counts.entries) {
            if (num == count && num > lucky) {
                lucky = num
            }
        }

        return lucky
    }
}