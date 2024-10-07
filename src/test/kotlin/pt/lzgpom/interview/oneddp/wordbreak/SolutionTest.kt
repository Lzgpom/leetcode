package pt.lzgpom.interview.oneddp.wordbreak

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty

class SolutionTest {
    private class Input(val s: String, val wordDict: List<String>)

    private val solution = Solution()
    private val examples = listOf(
        Input("leetcode", listOf("leet", "code")) to true,
        Input("applepenapple", listOf("apple", "pen")) to true,
        Input("catsandog", listOf("cats", "dog", "sand", "and", "cat")) to false,
        Input(
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
            listOf("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa")
        ) to false,
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("the ${input.s} should ${expected.notOrEmpty()} be able to be segmented by the words ${input.wordDict}") {
                // WHEN
                val result = solution.wordBreak(input.s, input.wordDict)

                // THEN
                assertEquals(expected, result)
            }
        }
}