package pt.lzgpom.interview.linkedlist.lrucache

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LRUCacheTest {

    @Test
    fun testWithExample() {
        val cache = LRUCache(2)
        cache.put(1, 1)
        cache.put(2, 2)
        assertEquals(1, cache.get(1))
        cache.put(3, 3)
        assertEquals(-1, cache.get(2))
        cache.put(4,4)
        assertEquals(-1, cache.get(1))
        assertEquals(3, cache.get(3))
        assertEquals(4, cache.get(4))
    }

    @Test
    fun testWithExample2() {
        val cache = LRUCache(1)
        cache.put(2, 1)
        assertEquals(1, cache.get(2))
    }
}