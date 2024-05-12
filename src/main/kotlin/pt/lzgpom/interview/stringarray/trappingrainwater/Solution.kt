package pt.lzgpom.interview.stringarray.trappingrainwater

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun trap(height: IntArray): Int {
        var iLeft = 0
        var maxLeftHeight = 0

        var iRight = height.lastIndex
        var maxRightHeight = 0

        var counter = 0

        while (iLeft <= iRight) {
            val minHeight = min(maxLeftHeight, maxRightHeight)

            while (height[iLeft] <= minHeight) {
                counter += minHeight - height[iLeft]
                iLeft++

                if (iLeft > iRight) {
                    return counter
                }
            }


            while (height[iRight] <= minHeight) {
                counter += minHeight - height[iRight]
                iRight--

                if (iLeft > iRight) {
                    return counter
                }
            }

            maxLeftHeight = max(maxLeftHeight, height[iLeft])
            maxRightHeight = max(maxRightHeight, height[iRight])
        }

        return counter
    }
}