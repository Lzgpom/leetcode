package pt.lzgpom.problems.p1353

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val events = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(1, 6),
            intArrayOf(1, 7),
        )

        // WHEN
        val result = solution.maxEvents(events)

        // THEN
        assertEquals(7, result)
    }

}