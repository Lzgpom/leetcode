package pt.lzgpom.interview.stack.minstack

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MinStackTest {

    @Test
    fun testWithExample() {
        // GIVEN
        val stack = MinStack()

        // WHEN
        stack.push(-2)
        stack.push(0)
        stack.push(-3)

        // THEN
        assertEquals(-3, stack.getMin())
        stack.pop()
        assertEquals(0, stack.top())
        assertEquals(-2, stack.getMin())
    }
}