package pt.lzgpom.interview.linkedlist.removeduplicatesfromsortedlist2

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var currentValue = head?.`val`
        var count = 1

        var current = head

        var prev: ListNode? = null
        var newHead: ListNode? = null

        while (current != null) {
            if (current.next?.`val` != currentValue) {
                if (count > 1) {
                    prev?.next = current.next
                } else {
                    if (prev == null) {
                        newHead = current
                    }

                    prev = current
                }

                currentValue = current.next?.`val`
                count = 0
            }

            count++
            current = current.next
        }

        return newHead
    }
}