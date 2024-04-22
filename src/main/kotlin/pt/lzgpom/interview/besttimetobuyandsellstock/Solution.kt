package pt.lzgpom.interview.besttimetobuyandsellstock

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices.first()
        var max = prices.first()

        var previousBest = 0

        for (price in prices) {
            if (price < min) {
                previousBest = max(max - min, previousBest)

                min = price
                max = price
            }

            if (price > max) {
                max = price
            }
        }

        return max(max - min, previousBest)
    }
}