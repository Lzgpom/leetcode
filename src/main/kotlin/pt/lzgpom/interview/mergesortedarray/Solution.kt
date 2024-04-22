package pt.lzgpom.interview.mergesortedarray

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var nums1Index = m - 1
        var nums2Index = n - 1

        for (insertIndex in n + m - 1 downTo 0) {
            if (nums1Index < 0) {
                nums1[insertIndex] = nums2[nums2Index]
                nums2Index--
            } else if (nums2Index < 0) {
                nums1[insertIndex] = nums1[nums1Index]
                nums1Index--
            } else if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[insertIndex] = nums1[nums1Index]
                nums1Index--
            } else {
                nums1[insertIndex] = nums2[nums2Index]
                nums2Index--
            }
        }
    }
}