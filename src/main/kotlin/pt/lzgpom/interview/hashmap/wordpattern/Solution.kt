package pt.lzgpom.interview.hashmap.wordpattern

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")

        if (words.size != pattern.length) {
            return false
        }

        val patternMap = HashMap<Char, String>()
        val usedWords = HashSet<String>()

        for (i in words.indices) {
            val patternWord = patternMap[pattern[i]]

            if (patternWord == null) {
                if (usedWords.contains(words[i])) {
                    return false
                }

                patternMap[pattern[i]] = words[i]
                usedWords.add(words[i])
            } else if (patternWord != words[i]) {
                return false
            }
        }

        return true
    }
}