package pt.lzgpom.problems.p0386

class Solution {
    fun lexicalOrder(n: Int): List<Int> {
        val result = ArrayList<Int>(n)
        aux(0, n, result)
        return result
    }

    fun aux(value: Int, n: Int, list: MutableList<Int>) {
        val start = if (value > 0) 0 else 1

        for (i in start..9) {
            val newValue = value + i
            if (newValue <= n) {
                list.add(newValue)
                aux(newValue * 10, n, list)
            } else {
                return
            }
        }
    }
}