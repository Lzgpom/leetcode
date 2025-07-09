package pt.lzgpom.problems.p3439

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val eventTime = 10
        val k = 1
        val startTime = intArrayOf(0, 2, 9)
        val endTime = intArrayOf(1, 4, 10)

        // WHEN
        val result = solution.maxFreeTime(eventTime, k, startTime, endTime)

        // THEN
        assertEquals(6, result)
    }

}