package pt.lzgpom.interview.linkedlist.removenthnodefromendoflist

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class SolutionTest {

    private val solution = Solution()

    private data class Input(val head: ListNode?, val n: Int)

    private val examples = listOf(
        Input(createLinkedListFromList(listOf(1, 2, 3, 4, 5)), 2) to listOf(1, 2, 3, 5),
        Input(createLinkedListFromList(listOf(1)), 1) to listOf(),
        Input(createLinkedListFromList(listOf(1, 2)), 1) to listOf(1),
        Input(createLinkedListFromList(listOf(1, 2)), 2) to listOf(2)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the list ${toList(input.head)} with the ${input.n}th from the end removed should be $expected") {
                // WHEN
                val result = solution.removeNthFromEnd(input.head, input.n)

                // THEN
                assertEquals(expected, toList(result))
            }
        }
}