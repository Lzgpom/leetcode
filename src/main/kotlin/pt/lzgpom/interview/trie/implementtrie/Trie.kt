package pt.lzgpom.interview.trie.implementtrie

class Trie {

    private val root = Node()

    fun insert(word: String) {
        var node = root

        for (i in word.indices) {
            val char = word[i]
            val indexOfChar = indexOfChar(char)
            val charNode = node.children[indexOfChar]

            if (charNode == null) {
                val newNode = Node()
                node.children[indexOfChar] = newNode

                node = newNode
            } else {
                node = charNode
            }

            if (i == word.lastIndex) {
                node.terminal = true
            }
        }
    }

    fun search(word: String): Boolean {
        return transverse(word)?.terminal ?: false
    }

    fun startsWith(prefix: String): Boolean {
        return transverse(prefix) != null
    }

    private fun transverse(word: String): Node? {
        var node = root

        for (char in word) {
            val indexOfChar = indexOfChar(char)
            val charNode = node.children[indexOfChar]

            if (charNode == null) {
                return null
            } else {
                node = charNode
            }
        }

        return node
    }

    private class Node {
        var terminal = false
        val children = Array<Node?>(26) {null}
    }

    companion object {
        private const val START_CHAR = 'a'

        fun indexOfChar(char: Char): Int {
            return char - START_CHAR
        }
    }
}