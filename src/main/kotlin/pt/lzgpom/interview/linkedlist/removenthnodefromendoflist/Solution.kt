package pt.lzgpom.interview.linkedlist.removenthnodefromendoflist

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var prev: ListNode? = head

        var current = head
        var distance = 0

        while (current != null) {
            if (distance > n) {
                prev = prev?.next
            }

            distance++
            current = current.next
        }

        if (distance > n) {
            prev?.next = prev?.next?.next

            return head
        }

        return head?.next
    }
}