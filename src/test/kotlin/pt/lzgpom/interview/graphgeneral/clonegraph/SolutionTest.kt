package pt.lzgpom.interview.graphgeneral.clonegraph

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val node1 = Solution.Node(1)
        val node2 = Solution.Node(2)
        val node3 = Solution.Node(3)
        val node4 = Solution.Node(4)

        node1.neighbors.add(node2)
        node1.neighbors.add(node4)

        node2.neighbors.add(node1)
        node2.neighbors.add(node3)

        node3.neighbors.add(node2)
        node3.neighbors.add(node4)

        node4.neighbors.add(node1)
        node4.neighbors.add(node3)

        // WHEN
        val result = solution.cloneGraph(node1)!!

        // THEN
        assertEquals(1, result.`val`)
        assertEquals(2, result.neighbors.size)
        assertNotSame(node1, result)
    }
}