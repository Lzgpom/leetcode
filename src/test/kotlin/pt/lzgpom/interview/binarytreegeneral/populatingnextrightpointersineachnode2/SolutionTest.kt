package pt.lzgpom.interview.binarytreegeneral.populatingnextrightpointersineachnode2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testWithExample() {
        // GIVEN
        val root = Solution.Node(1)

        val l1p1 = Solution.Node(2)
        root.left = l1p1

        val l1p2 = Solution.Node(3)
        root.right = l1p2

        val l2p1 = Solution.Node(4)
        l1p1.left = l2p1

        val l2p2 = Solution.Node(5)
        l1p1.right = l2p2

        val l2p3 = Solution.Node(7)
        l1p2.right = l2p3

        // WHEN
        solution.connect(root)

        // THEN
        assertEquals(l1p1.next, l1p2)
        assertEquals(l2p1.next, l2p2)
        assertEquals(l2p2.next, l2p3)
    }
}