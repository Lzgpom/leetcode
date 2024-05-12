package pt.lzgpom.interview.stringarray.hindex

import java.util.*

class Solution {
    fun hIndex(citations: IntArray): Int {
        val citationsCountMap = TreeMap<Int, Int>()
        citations.forEach { citationsCountMap.merge(it, 1) { v1, v2 -> v1 + v2 } }

        var currentCount = 0
        for (citation in citationsCountMap.descendingKeySet()) {
            if(citation < currentCount) {
                return currentCount
            }

            currentCount += citationsCountMap[citation]!!

            if (currentCount >= citation) {
                return citation
            }
        }

        return currentCount
    }
}
