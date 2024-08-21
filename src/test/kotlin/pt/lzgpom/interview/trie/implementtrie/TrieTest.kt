package pt.lzgpom.interview.trie.implementtrie

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TrieTest {

    @Test
    fun testWithExample() {
        val trie = Trie()

        println(Trie.Companion.indexOfChar('p'))

        trie.insert("apple")
        assertTrue(trie.search("apple"))
        assertFalse(trie.search("app"))
        assertTrue(trie.startsWith("app"))

        trie.insert("app")
        assertTrue(trie.startsWith("app"))
    }
}