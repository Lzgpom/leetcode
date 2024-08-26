package pt.lzgpom.interview.trie.wordsearch2

class Solution {
    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        val validWordsTrie = createWordsTrie(words)
        val validWords = HashSet<String>()

        for (x in board.indices) {
            for (y in board[x].indices) {
                findWord(board, validWordsTrie, x, y, "", validWords)
            }
        }

        return validWords.toList()
    }

    private fun findWord(
        board: Array<CharArray>,
        trie: Trie,
        x: Int,
        y: Int,
        currentWord: String,
        validWords: MutableSet<String>
    ) {
        val char = board[x][y]
        val charTrie = trie.getChildForChar(char) ?: return

        val word = currentWord + char

        if (charTrie.terminal) {
            validWords.add(word)
        }

        board[x][y] = '.'

        for ((nextX, nextY) in nextPositions(board, x, y)) {
            findWord(board, charTrie, nextX, nextY, word, validWords)
        }

        board[x][y] = char
    }

    private fun nextPositions(board: Array<CharArray>, x: Int, y: Int): Iterable<Pair<Int, Int>> {
        val positions = ArrayList<Pair<Int, Int>>()

        if (x > 0) {
            positions.add(x - 1 to y)
        }
        if (y > 0) {
            positions.add(x to y - 1)
        }
        if (x < board.lastIndex) {
            positions.add(x + 1 to y)
        }
        if (y < board[0].lastIndex) {
            positions.add(x to y + 1)
        }

        return positions
    }

    private fun createWordsTrie(words: Array<String>): Trie {
        val trie = Trie()

        for (word in words) {
            addWordToTrie(trie, word)
        }

        return trie
    }

    private fun addWordToTrie(root: Trie, word: String) {
        var node = root

        for (char in word) {
            val indexOfChar = char.index()
            val charNode = node.children[indexOfChar]

            if (charNode == null) {
                val newNode = Trie()
                node.children[indexOfChar] = newNode

                node = newNode
            } else {
                node = charNode
            }
        }

        node.terminal = true
    }

    private class Trie {
        var terminal = false
        var children = Array<Trie?>(26) { null }

        fun getChildForChar(char: Char) = children.getOrNull(char.index())
    }

    companion object {
        private const val START_CHAR = 'a'

        private fun Char.index(): Int {
            return this - START_CHAR
        }
    }
}