package pt.lzgpom.interview.linkedlist.removeduplicatesfromsortedlist2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        createLinkedListFromList(listOf(1, 2, 3, 3, 4, 4, 5)) to listOf(1, 2, 5),
        createLinkedListFromList(listOf(1, 1, 1, 2, 3)) to listOf(2, 3),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (head, expected) ->
            dynamicTest("should have only the distinct values for ${toList(head)}") {
                // WHEN
                val result = solution.deleteDuplicates(head)

                // THEN
                assertEquals(expected, toList(result))
            }
        }
}