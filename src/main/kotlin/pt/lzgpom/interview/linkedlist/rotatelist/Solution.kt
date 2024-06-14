package pt.lzgpom.interview.linkedlist.rotatelist

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        var last = head
        var size = 1

        while (last?.next != null) {
            last = last.next
            size++
        }

        last?.next = head

        val indexToNull = size - (k % size) - 1

        var current = head
        for (i in 0 until indexToNull) {
            current = current?.next
        }

        val newHead = current?.next
        current?.next = null

        return newHead
    }
}