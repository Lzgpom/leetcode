package pt.lzgpom.interview.linkedlist.partitionlist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class SolutionTest {
    private val solution = Solution()

    private data class Input(val head: ListNode?, val x: Int)

    private val examples = listOf(
        Input(createLinkedListFromList(listOf(1, 4, 3, 2, 5, 2)), 3) to listOf(1, 2, 2, 4, 3, 5),
        Input(createLinkedListFromList(listOf(2, 1)), 2) to listOf(1, 2)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the list ${toList(input.head)} partitioned by ${input.x} times should be $expected") {
                // WHEN
                val result = solution.partition(input.head, input.x)

                // THEN
                assertEquals(expected, toList(result))
            }
        }
}