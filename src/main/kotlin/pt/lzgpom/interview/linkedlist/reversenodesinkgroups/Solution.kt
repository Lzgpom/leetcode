package pt.lzgpom.interview.linkedlist.reversenodesinkgroups

import pt.lzgpom.interview.linkedlist.ListNode
import pt.lzgpom.interview.linkedlist.ListNode.Companion.toList

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var current = head
        var currentHead = head
        var previousEnd: ListNode? = null

        var newHead: ListNode? = null

        var counter = 0
        while (current != null) {
            counter++

            if (counter >= k) {
                val temp = current.next
                current.next = null

                val groupHead = reverseGroup(currentHead)
                if (newHead == null) {
                    newHead = groupHead
                }

                previousEnd?.next = groupHead
                previousEnd = currentHead

                currentHead = temp

                current = temp
                counter = 0
            } else {
                current = current.next
            }
        }

        previousEnd?.next = currentHead

        return newHead
    }

    private fun reverseGroup(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var next: ListNode? = head

        while (next != null) {
            val temp = next.next
            next.next = prev
            prev = next
            next = temp
        }

        return prev
    }
}