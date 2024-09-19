package pt.lzgpom.interview.binarysearch.medianoftwosortedarrays

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val n1 = nums1.size
        val n2 = nums2.size

        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1)
        }

        val totalLeft = (n1 + n2 + 1) / 2

        var left = 0
        var right = n1

        while (left <= right) {
            val middle1 = left + (right - left) / 2
            val middle2 = totalLeft - middle1

            val maxLeft1 = if ((middle1 == 0)) Int.MIN_VALUE else nums1[middle1 - 1]
            val minRight1 = if ((middle1 == n1)) Int.MAX_VALUE else nums1[middle1]

            val maxLeft2 = if ((middle2 == 0)) Int.MIN_VALUE else nums2[middle2 - 1]
            val minRight2 = if ((middle2 == n2)) Int.MAX_VALUE else nums2[middle2]

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((n1 + n2) % 2 == 1) {
                    return max(maxLeft1.toDouble(), maxLeft2.toDouble())
                }

                return (max(maxLeft1.toDouble(), maxLeft2.toDouble()) + min(
                    minRight1.toDouble(),
                    minRight2.toDouble()
                )) / 2.0

            } else if (maxLeft1 > minRight2) {
                right = middle1 - 1
            } else {
                left = middle1 + 1
            }
        }

        return 0.0
    }
}