package pt.lzgpom.interview.oneddp.wordbreak

class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val startToWord = wordDict.groupBy { it[0] }
        val startIndexChecked = HashSet<Int>()

        fun canBeCreatedWithDictionary(index: Int): Boolean {
            if (index > s.lastIndex) {
                return true
            }

            if (startIndexChecked.contains(index)) {
                return false
            }
            startIndexChecked.add(index)

            val wordsStartingInChar = startToWord[s[index]] ?: return false

            for (wordToCheck in wordsStartingInChar) {
                if(s.startsWith(wordToCheck, index)) {
                    if (canBeCreatedWithDictionary(index + wordToCheck.length)) {
                        return true
                    }
                }
            }

            return false
        }

        return canBeCreatedWithDictionary(0)
    }
}