package pt.lzgpom.problems.p3333

class Solution {
    fun possibleStringCount(word: String, k: Int): Int {
        val repeats = getWordRepeats(word)
        val totalPossibilities = repeats.reduce { acc, value -> (acc * value) % MODULO }

        // TODO implement dp solution which I did not understand
        return totalPossibilities
    }

    private fun getWordRepeats(word: String): List<Int> {
        val repeats = ArrayList<Int>()
        var previous = word[0]
        var count = 1

        for (i in 1 until word.length) {
            if (word[i] == previous) {
                count++
            } else {
                repeats.add(count)
                count = 1
                previous = word[i]
            }
        }

        repeats.add(count)

        return repeats
    }

    companion object {
        private const val MODULO: Int = (1e9 + 7).toInt()
    }
}