package pt.lzgpom.interview.linkedlist.copylistwithrandompointer

class Solution {
    fun copyRandomList(node: Node?): Node? {
        var current = node

        while (current != null) {
            val copy = Node(current.`val`)
            copy.next = current.next
            copy.random = current.random
            current.next = copy

            current = copy.next
        }

        current = node
        while (current != null) {
            current.next?.random = current.random?.next
            current = current.next?.next
        }

        val head = node?.next

        current = node
        while (current != null) {
            val copy = current.next
            val nextOriginal = copy?.next
            val nextCopy = nextOriginal?.next

            current.next = nextOriginal
            copy?.next = nextCopy

            current = nextOriginal
        }

        return head
    }


    class Node(var `val`: Int) {
        var next: Node? = null
        var random: Node? = null
    }
}