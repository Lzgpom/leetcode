package pt.lzgpom.interview.hashmap.validanagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val sCount = HashMap<Char, Int>()
        s.forEach { sCount.addToCount(it) }

        val tCount = HashMap<Char, Int>()
        t.forEach { tCount.addToCount(it) }

        return sCount == tCount
    }

    private fun HashMap<Char, Int>.addToCount(char: Char) {
        this[char] = this.getOrDefault(char, 0) + 1
    }
}