package pt.lzgpom.interview.oneddp.coinchange

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private class Input(val coins: IntArray, val amount: Int)

    private val solution = Solution()
    private val examples = listOf(
        Input(intArrayOf(1, 2, 5), 11) to 3,
        Input(intArrayOf(2), 3) to -1,
        Input(intArrayOf(1), 0) to 0,
        Input(intArrayOf(186, 419, 83, 408), 6249) to 20,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the number of coins needed to get ${input.amount} with the coins ${input.coins.contentToString()} should be $expected") {
                // WHEN
                val result = solution.coinChange(input.coins, input.amount)

                // THEN
                assertEquals(expected, result)
            }
        }
}