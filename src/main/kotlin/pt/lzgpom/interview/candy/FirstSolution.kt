package pt.lzgpom.interview.candy

class FirstSolution {

    /**
     * Solution without checking others. It does not work completely...
     */
    fun candy(ratings: IntArray): Int {
        var candies = 1

        var isDecreasing = false
        var indexOfDecrease = 0
        var valueOfDecrease = 0

        var leftCurrent = 1

        for (i in 1..ratings.lastIndex) {
            val previousIndex = i - 1

            if (isDecreasing) {
                if (ratings[previousIndex] <= ratings[i]) {
                    isDecreasing = false

                    candies += candiesToCompensate(indexOfDecrease, valueOfDecrease, previousIndex)

                    leftCurrent = 2
                    candies += leftCurrent
                }
            } else {
                if (ratings[previousIndex] < ratings[i]) {
                    leftCurrent++
                    candies += leftCurrent
                } else if (ratings[previousIndex] > ratings[i]) {
                    indexOfDecrease = previousIndex
                    valueOfDecrease = leftCurrent
                    isDecreasing = true

                    leftCurrent = 1
                    candies += leftCurrent
                } else {
                    leftCurrent = 1
                    candies += leftCurrent
                }
            }
        }

        if (isDecreasing) {
           candies += candiesToCompensate(indexOfDecrease, valueOfDecrease, ratings.lastIndex)
        }

        return candies
    }

    private fun candiesToCompensate(fromIndex: Int, valueOnFromIndex: Int, toIndex: Int): Int {
        val nChildrenToCompensate = toIndex - fromIndex
        val candiesToCompensateBetween = factorialSum(nChildrenToCompensate)

        val candiesToCompensateFrom = if (nChildrenToCompensate >= valueOnFromIndex) {
            (nChildrenToCompensate - valueOnFromIndex) + 1
        } else {
            0
        }

        return candiesToCompensateFrom + candiesToCompensateBetween
    }

    private fun factorialSum(n: Int): Int {
        return (((n * n) + n) / 2)
    }
}