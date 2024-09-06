package pt.lzgpom.interview.divideconquer.mergeksortedlists

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()
    private val examples= listOf(
        arrayOf(
            createLinkedListFromList(listOf(1, 4, 5)),
            createLinkedListFromList(listOf(1, 3, 4)),
            createLinkedListFromList(listOf(2, 6)),
        ) to listOf(1, 1, 2, 3, 4, 4, 5, 6),
        arrayOf<ListNode?>() to listOf(),
        arrayOf(createLinkedListFromList(listOf())) to listOf()
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (lists, expected) ->
            dynamicTest("the lists merged should be $expected") {
                // WHEN
                val result = solution.mergeKLists(lists)

                // THEN
                assertEquals(expected, ListNode.toList(result))
            }
        }
}