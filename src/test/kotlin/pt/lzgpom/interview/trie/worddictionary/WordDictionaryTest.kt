package pt.lzgpom.interview.trie.worddictionary

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class WordDictionaryTest {

    @Test
    fun testWithExample() {
        val dictionary = WordDictionary()

        dictionary.addWord("bad")
        dictionary.addWord("dad")
        dictionary.addWord("mad")
        assertFalse(dictionary.search("pad"))
        assertTrue(dictionary.search("bad"))
        assertTrue(dictionary.search(".ad"))
        assertTrue(dictionary.search("b.."))
    }
}