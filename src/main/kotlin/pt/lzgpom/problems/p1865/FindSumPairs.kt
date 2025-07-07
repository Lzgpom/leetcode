package pt.lzgpom.problems.p1865

class FindSumPairs(val nums1: IntArray, val nums2: IntArray) {

    private val nums2Count = HashMap<Int, Int>()

    init {
        for (num2 in nums2) {
            nums2Count.merge(num2, 1, Int::plus)
        }
    }

    fun add(index: Int, value: Int) {
        val oldValue = nums2[index]
        nums2Count.merge(oldValue, 1, Int::minus)

        val newValue = oldValue + value
        nums2Count.merge(newValue, 1, Int::plus)

        nums2[index] = newValue
    }

    fun count(tot: Int): Int {
        var result = 0
        for (num1 in nums1) {
            val num2Count = nums2Count[tot - num1]

            if (num2Count != null) {
                result += num2Count
            }
        }

        return result
    }
}