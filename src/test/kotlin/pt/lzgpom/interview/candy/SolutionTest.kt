package pt.lzgpom.interview.candy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val ratings = intArrayOf(1, 0, 2)
        val expected = 5

        // WHEN
        val result = solution.candy(ratings)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample2() {
        // GIVEN
        val ratings = intArrayOf(1, 2, 2)
        val expected = 4

        // WHEN
        val result = solution.candy(ratings)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample3() {
        // GIVEN
        val ratings = intArrayOf(1, 3, 2, 2, 1)
        val expected = 7

        // WHEN
        val result = solution.candy(ratings)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample4() {
        // GIVEN
        val ratings = intArrayOf(1, 2, 4, 4, 4, 3)
        val expected = 10

        // WHEN
        val result = solution.candy(ratings)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample5() {
        // GIVEN
        val ratings = intArrayOf(1, 2, 87, 87, 87, 2, 1)
        val expected = 13

        // WHEN
        val result = solution.candy(ratings)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun testWithExample6() {
        // GIVEN
        val ratings = intArrayOf(1, 3, 4, 5, 2)
        val expected = 11

        // WHEN
        val result = solution.candy(ratings)

        // THEN
        assertEquals(expected, result)
    }
}