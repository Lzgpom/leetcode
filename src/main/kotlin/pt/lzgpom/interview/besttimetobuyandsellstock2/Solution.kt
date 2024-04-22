package pt.lzgpom.interview.besttimetobuyandsellstock2

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var sum = 0

        for (i in 1 ..<prices.size) {
            if (prices[i - 1] < prices[i]) {
                sum += prices[i] - prices[i - 1]
            }
        }

        return sum
    }
}