package pt.lzgpom.interview.linkedlist.linkedlistcycle

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.linkedlist.LinkedListUtils.Companion.createLinkedListFromList
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        true to createLinkedListFromList(listOf(3, 2, 0, -4), 1),
        true to createLinkedListFromList(listOf(1, 2), 0),
        false to createLinkedListFromList(listOf(1), -1)
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (expected, head) ->
            dynamicTest("the cycle should be $expected") {
                // WHEN
                val result = solution.hasCycle(head)

                // THEN
                assertEquals(expected, result)
            }
        }
}