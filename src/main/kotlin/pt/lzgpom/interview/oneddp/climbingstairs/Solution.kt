package pt.lzgpom.interview.oneddp.climbingstairs

class Solution {
    fun climbStairs(n: Int): Int {
        val possibilitiesForSteps = HashMap<Int, Int>()

        fun distinctWays(steps: Int): Int {
            if (steps <= 1) {
                return 1
            }

            possibilitiesForSteps[steps]?.let { return it }

            val ways = distinctWays(steps - 1) + distinctWays(steps - 2)
            possibilitiesForSteps[steps] = ways

            return ways
        }

        return distinctWays(n)
    }
}