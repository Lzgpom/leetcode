package pt.lzgpom.interview.graphbfs.minimumgeneticmutation

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SolutionTest {
    private val solution = Solution()

    private class Input(val startGene: String, val endGene: String, val bank: Array<String>)

    private val examples = listOf(
        Input(
            "AACCGGTT",
            "AACCGGTA",
            arrayOf("AACCGGTA")
        ) to 1,
        Input(
            "AACCGGTT",
            "AAACGGTA",
            arrayOf("AACCGGTA", "AACCGCTA", "AAACGGTA")
        ) to 2
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (input, expected) ->
            dynamicTest("it should only need $expected mutations to get from ${input.startGene} to ${input.endGene}" +
                    "with the following possible mutations ${input.bank.contentToString()}") {
                // WHEN
                val result = solution.minMutation(input.startGene, input.endGene, input.bank)

                // THEN
                assertEquals(expected, result)
            }
        }

    @Test
    fun testIsMutation() {
        assertTrue(solution.isMutation("AACCGGTT", "AACCGGTA"))

        assertFalse(solution.isMutation("AACCGGTT", "AAACGGTA"))

        assertTrue(solution.isMutation("AACCGGTT", "AACCGGTA"))
        assertTrue(solution.isMutation("AACCGGTA", "AAACGGTA"))
    }
}