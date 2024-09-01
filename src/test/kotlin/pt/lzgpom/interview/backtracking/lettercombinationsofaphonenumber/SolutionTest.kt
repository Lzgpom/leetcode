package pt.lzgpom.interview.backtracking.lettercombinationsofaphonenumber

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        "23" to listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
        "" to listOf(),
        "2" to listOf("a", "b", "c")
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (digits, expected) ->
            dynamicTest("the letter combinations from the numbers $digits should be $expected") {
                // WHEN
                val result = solution.letterCombinations(digits)

                // THEN
                assertEquals(expected.size, result.size)
                assertTrue(result.containsAll(expected))
            }
        }
}