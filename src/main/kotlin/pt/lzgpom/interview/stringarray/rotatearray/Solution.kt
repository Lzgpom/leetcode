package pt.lzgpom.interview.stringarray.rotatearray

class Solution {
    fun rotate(array: IntArray, k: Int) {
        if (array.size <= 1 || k <= 0) {
            return
        }

        var currentIndex = 0
        var holder = array[0]
        var rotateCount = 0

        while (rotateCount < array.size) {
            var startIndex = currentIndex
            do {
                currentIndex = (currentIndex + k) % array.size

                val temp = array[currentIndex]
                array[currentIndex] = holder
                holder = temp

                rotateCount++

                if (rotateCount >= array.size) {
                    return
                }
            } while (currentIndex != startIndex)

            startIndex++
            currentIndex = startIndex
            holder = array[currentIndex]
        }
    }
}
