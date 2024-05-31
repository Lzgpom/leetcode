package pt.lzgpom.interview.linkedlist.addtwonumbers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        Triple(
            createLinkedListFromList(listOf(2, 4, 3)),
            createLinkedListFromList(listOf(5, 6, 4)),
            listOf(7, 0, 8)
        ),
        Triple(
            createLinkedListFromList(listOf(0)),
            createLinkedListFromList(listOf(0)),
            listOf(0)
        ),
        Triple(
            createLinkedListFromList(listOf(9, 9, 9, 9, 9, 9, 9)),
            createLinkedListFromList(listOf(9, 9, 9, 9)),
            listOf(8, 9, 9, 9, 0, 0, 0, 1)
        ),
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (l1, l2, expected) ->
            dynamicTest("${toList(l1)} plus ${toList(l2)} should be $expected") {
                // WHEN
                val result = solution.addTwoNumbers(l1, l2)

                // THEN
                val resultList = toList(result)
                assertEquals(expected, resultList)
            }
        }
}