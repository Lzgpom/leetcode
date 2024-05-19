package pt.lzgpom.interview.slidingwindow.substringwithconcatonationofallwords

class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordSize = words.first().length

        val wordCountNeeded = HashMap<String, Int>()
        for (word in words) {
            wordCountNeeded.addToCount(word)
        }

        val startIndexes = mutableListOf<Int>()

        for (i in 0..s.length - wordSize * words.size) {
            val substring = s.substring(i, i + (wordSize * words.size))
            if (checkIfValid(substring, wordSize, wordCountNeeded)) {
                startIndexes.add(i)
            }
        }

        return startIndexes
    }

    private fun checkIfValid(s: String, wordSize: Int, neededWords: Map<String, Int>): Boolean {
        val seenWords = HashMap<String, Int>()
        val substrings = s.chunked(wordSize)

        for (substring in substrings) {
            seenWords.addToCount(substring)
        }

        return neededWords == seenWords
    }


    private fun HashMap<String, Int>.addToCount(word: String) {
        this[word] = this.getOrDefault(word, 0) + 1
    }
}