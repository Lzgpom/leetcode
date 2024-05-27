package pt.lzgpom.interview.stack.minstack

import kotlin.math.min

class MinStack {
    private var head: Node? = null

    fun push(value: Int) {
        head = if (head == null) {
            Node(value, value, null)
        } else {
            Node(value, min(value, head!!.min), head)
        }
    }

    fun pop() {
        head = head?.next
    }

    fun top(): Int {
        return head!!.value
    }

    fun getMin(): Int {
        return head!!.min
    }

    private data class Node(val value: Int, val min: Int, var next: Node?)
}