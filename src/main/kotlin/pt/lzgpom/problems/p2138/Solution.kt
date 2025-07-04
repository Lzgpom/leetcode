package pt.lzgpom.problems.p2138

import kotlin.math.ceil

class Solution {
    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        val chunkCount = ceil(s.length / k.toDouble()).toInt()
        val chunks = Array(chunkCount) { "" }

        val currentChunk = StringBuilder(k)
        var currentChunkIndex = 0

        for (i in 0 until chunkCount * k) {
            if (i < s.length) {
                currentChunk.append(s[i])
            } else {
                currentChunk.append(fill)
            }

            if (currentChunk.length == k) {
                chunks[currentChunkIndex] = currentChunk.toString()

                currentChunk.clear()
                currentChunkIndex++
            }
        }

        return chunks
    }
}