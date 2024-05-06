package pt.lzgpom.interview.integertoroman

class Solution {
    fun intToRoman(num: Int): String {
        var valueIndex = VALUES.lastIndex
        var remainder = num

        val result = StringBuilder()

        while (remainder > 0) {
            if (valueIndex % 2 == 1) {
                val division = remainder / VALUES[valueIndex - 1]

                if (division == 9) {
                    result.append(SYMBOLS[valueIndex - 1])
                    result.append(SYMBOLS[valueIndex + 1])

                    remainder %= VALUES[valueIndex - 1]
                    continue
                }
            }

            val division = remainder / VALUES[valueIndex]
            remainder %= VALUES[valueIndex]

            if (division >= 4 && valueIndex < VALUES.lastIndex) {
                result.append(SYMBOLS[valueIndex])
                result.append(SYMBOLS[valueIndex + 1])
            } else if (division > 0) {
                result.repeat(SYMBOLS[valueIndex], division)
            }

            valueIndex--
        }

        return result.toString()
    }

    companion object {
        private val VALUES = intArrayOf(1, 5, 10, 50, 100, 500, 1000)
        private val SYMBOLS = charArrayOf('I', 'V', 'X', 'L', 'C', 'D', 'M')

        private fun StringBuilder.repeat(char: Char, times: Int) {
            for (i in 0 until times) {
                this.append(char)
            }
        }
    }
}