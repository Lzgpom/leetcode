package pt.lzgpom.problems.p3085

import kotlin.math.min

class Solution {
    fun minimumDeletions(word: String, k: Int): Int {
        val frequencies = IntArray('z' - 'a' + 1)
        for (char in word) {
            frequencies['z' - char]++
        }

        var result = word.length

        for (frequencyToTest in frequencies) {
            var changes = 0

            for (frequency in frequencies) {
                val diff = frequency - frequencyToTest
                if (diff < 0) {
                    changes += frequency
                } else if (diff > k) {
                    changes += diff - k
                }
            }

            result = min(result, changes)
        }

        return result
    }
}