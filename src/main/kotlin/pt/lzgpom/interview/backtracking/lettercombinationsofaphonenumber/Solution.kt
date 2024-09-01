package pt.lzgpom.interview.backtracking.lettercombinationsofaphonenumber

class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }

        val combinations = ArrayList<String>()

        fun combination(digits: String, value: String) {
            if (digits.isEmpty()) {
                combinations.add(value)
                return
            }

            val digit = digits[0]
            for (char in DIGIT_TO_CHARS[digit]!!) {
                combination(digits.substring(1), value + char)
            }
        }

        combination(digits, "")
        return combinations
    }

    companion object {
        private val DIGIT_TO_CHARS = mapOf(
            '2' to arrayOf('a', 'b', 'c'),
            '3' to arrayOf('d', 'e', 'f'),
            '4' to arrayOf('g', 'h', 'i'),
            '5' to arrayOf('j', 'k', 'l'),
            '6' to arrayOf('m', 'n', 'o'),
            '7' to arrayOf('p', 'q', 'r', 's'),
            '8' to arrayOf('t', 'u', 'v'),
            '9' to arrayOf('w', 'x', 'y', 'z'),
        )
    }
}