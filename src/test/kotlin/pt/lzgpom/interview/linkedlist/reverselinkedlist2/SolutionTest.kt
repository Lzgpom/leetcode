package pt.lzgpom.interview.linkedlist.reverselinkedlist2

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        Input(createLinkedListFromList(listOf(1, 2, 3, 4, 5)), 2, 4) to listOf(1, 4, 3, 2, 5),
        Input(createLinkedListFromList(listOf(5)), 1, 1) to listOf(5),
        Input(createLinkedListFromList(listOf(3, 5)), 1, 2) to listOf(5, 3),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the list the ${toList(input.head)} reversed from ${input.left} to ${input.right} should be $expected") {
                // WHEN
                val result = solution.reverseBetween(input.head, input.left, input.right)

                // THEN
                assertEquals(toList(result), expected)
            }
        }


    private data class Input(val head: ListNode?, val left: Int, val right: Int)
}