package pt.lzgpom.problems.p2966

class Solution {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        nums.sort()

        val result = Array(nums.size / SIZE) { IntArray(3) }
        for ((index, num) in nums.withIndex()) {
            val chunk = index / SIZE
            val chunkIndex = index % SIZE

            result[chunk][chunkIndex] = num

            if (chunkIndex == SIZE - 1 && result[chunk].last() - result[chunk].first() > k) {
                return arrayOf()
            }
        }

        return result
    }

    companion object {
        private const val SIZE = 3
    }
}