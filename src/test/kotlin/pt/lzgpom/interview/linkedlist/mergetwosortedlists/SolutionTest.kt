package pt.lzgpom.interview.linkedlist.mergetwosortedlists

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        Triple(
            listOf(1, 1, 2, 3, 4, 4),
            createLinkedListFromList(listOf(1, 2, 4)),
            createLinkedListFromList(listOf(1, 3, 4)),
        ),
        Triple(
            listOf(),
            createLinkedListFromList(listOf()),
            createLinkedListFromList(listOf())
        ),
        Triple(
            listOf(0),
            createLinkedListFromList(listOf()),
            createLinkedListFromList(listOf(0)),
        )
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (expected, list1, list2) ->
            dynamicTest("the ${toList(list1)} and ${toList(list2)} should merge into $expected") {
                // WHEN
                val result = solution.mergeTwoLists(list1, list2)

                // THEN
                val resultList = toList(result)

                assertEquals(expected, resultList)
            }
        }
}