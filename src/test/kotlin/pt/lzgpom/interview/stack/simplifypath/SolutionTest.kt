package pt.lzgpom.interview.stack.simplifypath

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class SolutionTest {

    private val solution = Solution()
    private val examples = listOf(
        "/home/" to "/home",
        "/home//foo/" to "/home/foo",
        "/home/user/Documents/../Pictures" to "/home/user/Pictures",
        "/.../a/../b/c/../d/./" to "/.../b/d"
    )

    @TestFactory
    fun testWithExamples() = examples
        .map { (path, expected) ->
            dynamicTest("when I simplify path: $path I should get $expected") {
                // WHEN
                val result = solution.simplifyPath(path)

                // THEN
                assertEquals(expected, result)
            }
        }

}