package pt.lzgpom.problems.p2014

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun longestSubsequenceRepeatedK(s: String, k: Int): String {
        val queue: Queue<String> = LinkedList()
        queue.add("")

        var result = ""

        while (queue.isNotEmpty()) {
            val current = queue.poll()
            result = current

            for (char in 'a'..'z') {
                val newValue = current + char
                if (existsKTimes(s, newValue, k)) {
                    queue.add(newValue)
                }
            }
        }

        return result
    }

    private fun existsKTimes(word: String, subString: String, k: Int): Boolean {
        var subIndex = 0
        var count = 0

        for (char in word) {
            if (char == subString[subIndex]) {
                if (subIndex == subString.lastIndex) {
                    count++
                    subIndex = 0

                    if (count >= k) {
                        return true
                    }
                } else {
                    subIndex++
                }
            }
        }

        return false
    }
}