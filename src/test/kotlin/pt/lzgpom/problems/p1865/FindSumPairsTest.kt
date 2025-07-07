package pt.lzgpom.problems.p1865

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class FindSumPairsTest {

    @Test
    fun testWithExample() {
        val underTest = FindSumPairs(
            intArrayOf(1, 1, 2, 2, 2, 3),
            intArrayOf(1, 4, 5, 2, 5, 4)
        )

        assertEquals(8, underTest.count(7))
        underTest.add(3, 2)
        assertEquals(2, underTest.count(8))
        assertEquals(1, underTest.count(4))
        underTest.add(0, 1)
        underTest.add(1, 1)
        assertEquals(11, underTest.count(7))
    }

}