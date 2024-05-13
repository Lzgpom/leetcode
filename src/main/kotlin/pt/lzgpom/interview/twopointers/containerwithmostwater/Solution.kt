package pt.lzgpom.interview.twopointers.containerwithmostwater

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex

        var maxArea = 0

        while (left < right) {
            val currentArea = (right - left) * min(height[left], height[right])
            maxArea = max(currentArea, maxArea)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }

        return maxArea
    }
}