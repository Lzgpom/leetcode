package pt.lzgpom.interview.graphbfs.wordladder

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val remainingWords = wordList.toHashSet()

        val queue: Queue<Pair<String, Int>> = LinkedList()
        queue.add(beginWord to 1)

        while (queue.isNotEmpty()) {
            val (currentWord, count) = queue.poll()

            val remainingWordsIterator = remainingWords.iterator()
            while (remainingWordsIterator.hasNext()) {
                val word = remainingWordsIterator.next()

                if (word isValidTransformationOf currentWord) {
                    if (word == endWord) {
                        return count + 1
                    }

                    queue.add(word to count + 1)
                    remainingWordsIterator.remove()
                }
            }
        }

        return 0
    }

    private infix fun String.isValidTransformationOf(word: String): Boolean {
        var characterChanged = false

        for (i in this.indices) {
            if (this[i] != word[i]) {
                if (characterChanged) {
                    return false
                }

                characterChanged = true
            }
        }

        return characterChanged
    }
}