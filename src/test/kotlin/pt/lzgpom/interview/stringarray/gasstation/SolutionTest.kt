package pt.lzgpom.interview.stringarray.gasstation

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val gas = intArrayOf(1, 2, 3, 4, 5)
        val cost = intArrayOf(3, 4, 5, 1, 2)
        val expected = 3

        // WHEN
        val result = solution.canCompleteCircuit(gas, cost)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val gas = intArrayOf(2, 3, 4)
        val cost = intArrayOf(3, 4, 3)
        val expected = -1

        // WHEN
        val result = solution.canCompleteCircuit(gas, cost)

        // THEN
        assertEquals(expected, result)
    }
}