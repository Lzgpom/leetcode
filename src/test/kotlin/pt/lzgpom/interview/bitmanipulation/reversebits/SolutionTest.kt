package pt.lzgpom.interview.bitmanipulation.reversebits

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class SolutionTest {
    private val solution = Solution()
    private val examples = listOf(
        43261596 to 964176192,
        -3 to -1073741825
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (n, expected) ->
            dynamicTest("the reverse bits of the number $n should be $expected") {
                // WHEN
                val result = solution.reverseBits(n)

                // THEN
                assertEquals(expected, result)
            }
        }

    @Test
    fun test() {
        var num = 1
        num = num shl 1
        num = num or (5 and 1)
        num = num shr 1

        println("num: $num binary: ${Integer.toBinaryString(num)}")

    }

}