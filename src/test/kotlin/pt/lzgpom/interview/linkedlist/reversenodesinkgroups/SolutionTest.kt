package pt.lzgpom.interview.linkedlist.reversenodesinkgroups

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class SolutionTest {

    private val solution = Solution()

    private data class Input(val head: ListNode?, val k: Int);
    private val examples = listOf(
        Input(createLinkedListFromList(listOf(1, 2, 3, 4, 5)), 2) to listOf(2, 1, 4, 3, 5),
        Input(createLinkedListFromList(listOf(1, 2, 3, 4, 5)), 3) to listOf(3, 2, 1, 4, 5),
        Input(createLinkedListFromList(listOf(1, 2, 3, 4)), 2) to listOf(2, 1, 4, 3),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the list ${toList(input.head)} reverse in ${input.k} groups should be $expected") {
                // WHEN
                val result = solution.reverseKGroup(input.head, input.k)

                // THEN
                assertEquals(expected, toList(result))
            }
        }
}