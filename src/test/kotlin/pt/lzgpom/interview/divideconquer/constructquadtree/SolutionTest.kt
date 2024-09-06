package pt.lzgpom.interview.divideconquer.constructquadtree

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val grid = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0)
        )

        // WHEN
        val result = solution.construct(grid)!!

        // THEN
        assertFalse(result.isLeaf)

        assertNotNull(result.topLeft)
        assertTrue(result.topLeft!!.isLeaf)
        assertFalse(result.topLeft!!.`val`)

        assertNotNull(result.topRight)
        assertTrue(result.topRight!!.isLeaf)
        assertTrue(result.topRight!!.`val`)

        assertNotNull(result.bottomLeft)
        assertTrue(result.bottomLeft!!.isLeaf)
        assertTrue(result.bottomLeft!!.`val`)

        assertNotNull(result.bottomRight)
        assertTrue(result.bottomRight!!.isLeaf)
        assertFalse(result.bottomRight!!.`val`)
    }
}