package pt.lzgpom.interview.math.palindromenumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import pt.lzgpom.interview.TestNameUtils.Companion.notOrEmpty

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        121 to true,
        -121 to false,
        10 to false
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (x, expected) ->
            dynamicTest("the number $x should ${expected.notOrEmpty()} be a palindrome") {
                // WHEN
                val result = solution.isPalindrome(x)

                // THEN
                assertEquals(expected, result)
            }
        }
}