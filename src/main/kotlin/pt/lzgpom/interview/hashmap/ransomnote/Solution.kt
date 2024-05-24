package pt.lzgpom.interview.hashmap.ransomnote

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val required = HashMap<Char, Int>()
        ransomNote.forEach { required.addToCount(it) }

        for (letter in magazine) {
            required.removeFromCount(letter)

            if (required.isEmpty()) {
                return true
            }
        }

        return false
    }

    private fun HashMap<Char, Int>.addToCount(char: Char) {
        this[char] = this.getOrDefault(char, 0) + 1
    }

    private fun HashMap<Char, Int>.removeFromCount(char: Char) {
        val newValue = this.computeIfPresent(char) { _, value -> value - 1 }

        newValue?.let {
            if (it <= 0) {
                this.remove(char)
            }
        }
    }
}