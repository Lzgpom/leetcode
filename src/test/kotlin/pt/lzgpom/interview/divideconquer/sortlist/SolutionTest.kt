package pt.lzgpom.interview.divideconquer.sortlist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        createLinkedListFromList(listOf(4, 2, 1, 3)) to listOf(1, 2, 3, 4),
        createLinkedListFromList(listOf(-1, 5, 3, 4, 0)) to listOf(-1, 0, 3, 4, 5),
        createLinkedListFromList(listOf()) to listOf(),
        createLinkedListFromList(listOf(3, 2, 1)) to listOf(1, 2, 3),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (head, expected) ->
            dynamicTest("the list ${ListNode.toList(head)} sorted should be $expected") {
                // WHEN
                val result = solution.sortList(head)

                // THEN
                assertEquals(expected, ListNode.toList(result))
            }
        }
}