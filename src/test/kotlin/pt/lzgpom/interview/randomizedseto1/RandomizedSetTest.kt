package pt.lzgpom.interview.randomizedseto1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RandomizedSetTest {

    @Test
    fun testWithExample() {
        // GIVEN
        val expected = 2

        // WHEN
        val randomizedSet = RandomizedSet()
        randomizedSet.insert(1)
        randomizedSet.remove(2)
        randomizedSet.insert(2)
        randomizedSet.getRandom()
        randomizedSet.remove(1)
        randomizedSet.insert(2)

        val result = randomizedSet.getRandom()

        // THEN
        assertEquals(expected, result)
    }
}