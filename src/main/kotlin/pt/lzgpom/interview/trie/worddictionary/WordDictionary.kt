package pt.lzgpom.interview.trie.worddictionary

class WordDictionary {
    private val root = Node()

    fun addWord(word: String) {
        var node = root

        for (char in word) {
            val indexOfChar = char.index()
            val charNode = node.children[indexOfChar]

            if (charNode == null) {
                val newNode = Node()
                node.children[indexOfChar] = newNode

                node = newNode
            } else {
                node = charNode
            }
        }

        node.terminal = true
    }

    fun search(word: String): Boolean {
        fun aux(node: Node, word: String, index: Int): Boolean {
            val currentChar = word[index]

            if (index == word.lastIndex) {
                if (currentChar.isWildCard()) {
                    return node.hasAtLeastOneTerminalNode()
                }

                return node.isTerminal(currentChar.index())
            }

            if (currentChar.isWildCard()) {
                for (childrenNode in node.children) {
                    if (childrenNode != null) {
                        if (aux(childrenNode, word, index + 1)) {
                            return true
                        }
                    }
                }

                return false
            }

            val charNode = node.children[currentChar.index()]
            if (charNode != null) {
                return aux(charNode, word, index + 1)
            }

            return false
        }

        return aux(root, word, 0)
    }

    private class Node {
        var terminal = false
        val children = Array<Node?>(26) { null }

        fun hasAtLeastOneTerminalNode(): Boolean {
            return children.any { it?.terminal ?: false }
        }

        fun isTerminal(child: Int): Boolean {
            return children[child]?.terminal ?: false
        }
    }

    companion object {
        private const val START_CHAR = 'a'
        private const val WILDCARD_CHAR = '.'

        private fun Char.index(): Int {
            return this - START_CHAR
        }

        private fun Char.isWildCard(): Boolean {
            return this == WILDCARD_CHAR
        }
    }
}