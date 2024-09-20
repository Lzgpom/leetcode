package pt.lzgpom.interview.heap.findmedianfromdatastream

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MedianFinderTest {

    @Test
    fun testWithExample() {
        val finder = MedianFinder()

        finder.addNum(1)
        assertEquals(1.0, finder.findMedian())

        finder.addNum(2)
        assertEquals(1.5, finder.findMedian())

        finder.addNum(3)
        assertEquals(2.0, finder.findMedian())

        finder.addNum(4)
        assertEquals(2.5, finder.findMedian())

        finder.addNum(5)
        assertEquals(3.0, finder.findMedian())
    }

    @Test
    fun testWithExample2() {
        val finder = MedianFinder()

        finder.addNum(-1)
        assertEquals(-1.0, finder.findMedian())

        finder.addNum(-2)
        assertEquals(-1.5, finder.findMedian())

        finder.addNum(-3)
        assertEquals(-2.0, finder.findMedian())

        finder.addNum(-4)
        assertEquals(-2.5, finder.findMedian())

        finder.addNum(-5)
        assertEquals(-3.0, finder.findMedian())
    }
}