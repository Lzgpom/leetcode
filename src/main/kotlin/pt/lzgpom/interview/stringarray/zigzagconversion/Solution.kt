package pt.lzgpom.interview.stringarray.zigzagconversion

import kotlin.math.max

class Solution {
    fun convert(s: String, numRows: Int): String {
        val middleCount = max(numRows - 2, 0)
        val zigzag = StringBuilder()

        for (i in 0 until numRows) {
            var currentPosition = i
            while (currentPosition < s.length) {
                zigzag.append(s[currentPosition])

                if (i in 1..<numRows - 1) {
                    val middlePos = currentPosition + ((numRows - i - 1) * 2)

                    if (middlePos < s.length) {
                        print("$middlePos ")
                        zigzag.append(s[middlePos])
                    }
                }

                currentPosition += numRows + middleCount
            }
        }

        return zigzag.toString()
    }
}