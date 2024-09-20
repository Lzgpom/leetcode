package pt.lzgpom.interview.heap.findmedianfromdatastream

import java.util.PriorityQueue

class MedianFinder {
    var size = 0
    val lower = PriorityQueue<Int>(Comparator.reverseOrder())
    val higher = PriorityQueue<Int>()

    fun addNum(num: Int) {
        size++
        lower.add(num)
        higher.add(lower.poll())

        if (lower.size < size / 2 + 1) {
            lower.add(higher.poll())
        }
    }

    fun findMedian(): Double {
        if (size == 0) {
            return -1.0
        }

        if (size % 2 == 0) {
            val num1 = lower.poll()
            val num2 = lower.peek()
            val median = (num1 + num2) / 2.0

            lower.add(num1)
            return median
        }
        return lower.peek().toDouble()
    }
}