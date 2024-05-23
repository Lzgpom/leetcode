package pt.lzgpom.interview.slidingwindow.minimumwindowsubstring

class Solution {
    fun minWindow(s: String, t: String): String {
        val requirement = HashMap<Char, Int>()
        t.forEach { requirement.addToCount(it) }

        var left = 0
        var right = 0
        val current = HashMap<Char, Int>()

        var bestLeft = 0
        var bestSize = s.length + 1

        while (right < s.length) {
            current.addToCount(s[right])

            while (containsAllCount(requirement, current)) {
                val size = right - left + 1
                if (size < bestSize) {
                    bestSize = size
                    bestLeft = left
                }

                current.removeFromCount(s[left])
                left++
            }

            right++
        }

        return if (bestSize > s.length) {
            ""
        } else {
            s.substring(bestLeft, bestLeft + bestSize)
        }
    }

    private fun containsAllCount(required: Map<Char, Int>, given: Map<Char, Int>): Boolean {
        for (requiredEntry in required) {
            val givenCharCount = given[requiredEntry.key]
            if (givenCharCount == null || givenCharCount < requiredEntry.value) {
                return false
            }
        }

        return true
    }

    private fun HashMap<Char, Int>.addToCount(char: Char) {
        this[char] = this.getOrDefault(char, 0) + 1
    }

    private fun HashMap<Char, Int>.removeFromCount(char: Char) {
        val newValue = this.computeIfPresent(char) { _, value -> value - 1 }

        newValue?.let {
            if (it <= 0) {
                this.remove(char)
            }
        }
    }
}