package pt.lzgpom.interview.stringarray.candy

import kotlin.math.min

class Solution {
    fun candy(ratings: IntArray): Int {
        var candies = ratings.size

        var i = 1
        while (i < ratings.size) {
            if (ratings[i] == ratings[i - 1]) {
                i++
                continue
            }

            var peak = 0
            while (ratings[i] > ratings[i - 1]){
                peak++
                candies += peak
                i++

                if (i >= ratings.size) {
                    return candies
                }
            }

            var valley = 0
            while (i < ratings.size && ratings[i] < ratings[i - 1]) {
                valley++
                candies += valley
                i++
            }

            candies -= min(peak, valley)
        }

        return candies
    }
}