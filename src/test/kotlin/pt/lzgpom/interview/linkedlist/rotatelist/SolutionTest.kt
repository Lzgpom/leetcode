package pt.lzgpom.interview.linkedlist.rotatelist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class SolutionTest {

    private val solution = Solution()

    private data class Input(val head: ListNode?, val k: Int)

    private val examples = listOf(
        Input(createLinkedListFromList(listOf(1, 2, 3, 4, 5)), 2) to listOf(4, 5, 1, 2, 3),
        Input(createLinkedListFromList(listOf(0, 1, 2)), 4) to listOf(2, 0, 1)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the list ${toList(input.head)} rotated $input.k times should be $expected") {
                // WHEN
                val result = solution.rotateRight(input.head, input.k)

                // THEN
                assertEquals(expected, toList(result))
            }
        }

}