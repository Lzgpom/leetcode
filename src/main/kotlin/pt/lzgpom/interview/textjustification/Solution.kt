package pt.lzgpom.interview.textjustification

class Solution {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        return words.toList()
            .chunkByWidth(maxWidth)
            .justifyLines(maxWidth)
    }

    private fun List<String>.chunkByWidth(maxWidth: Int): List<List<String>> {
        val chunks = mutableListOf<List<String>>()

        var chunk = mutableListOf<String>()
        var chunkSize = 0

        for (word in this) {
            if (word.length + chunkSize <= maxWidth) {
                chunk.add(word)
                chunkSize += word.length + 1
            } else {
                chunks.add(chunk)

                chunk = mutableListOf()
                chunk.add(word)
                chunkSize = word.length + 1
            }
        }

        chunks.add(chunk)
        return chunks
    }

    private fun List<List<String>>.justifyLines(maxWidth: Int): List<String> {
        val lastLine = justifyLastLine(last(), maxWidth)

        if (this.size > 1) {
            return this.subList(0, this.lastIndex).map { justifyLine(it, maxWidth) } + lastLine
        }

        return listOf(lastLine)
    }

    private fun justifyLine(words: List<String>, maxWidth: Int): String {
        val remainingSpaces = maxWidth - words.sumOf { it.length }

        val spaceSize: Int
        var extraSpaces: Int

        if (words.size > 1) {
            spaceSize = remainingSpaces / (words.size - 1)
            extraSpaces = remainingSpaces % (words.size - 1)
        } else {
            spaceSize = remainingSpaces
            extraSpaces = 0
        }

        val line = StringBuilder()

        for (i in words.indices) {
            line.append(words[i])

            if (i < words.lastIndex || words.size == 1) {
                val hasExtraSpace = extraSpaces > 0
                val spaces: Int

                if (hasExtraSpace) {
                    extraSpaces--
                    spaces = spaceSize + 1
                } else {
                    spaces = spaceSize
                }

                line.append(" ".repeat(spaces))
            }
        }

        return line.toString()
    }

    private fun justifyLastLine(words: List<String>, maxWidth: Int): String {
        val line = StringBuilder(words.joinToString(" "))
        val remaining = maxWidth - line.length
        line.append(" ".repeat(remaining))

        return line.toString()
    }
}