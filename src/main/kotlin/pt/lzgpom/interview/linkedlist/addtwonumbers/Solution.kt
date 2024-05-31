package pt.lzgpom.interview.linkedlist.addtwonumbers

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val start = ListNode(0, null)

        var head1 = l1
        var head2 = l2
        var carryover = 0
        var node = start

        while (head1 != null || head2 != null) {
            val value1 = head1?.`val` ?: 0
            val value2 = head2?.`val` ?: 0

            val value = value1 + value2 + carryover
            carryover = value / 10

            val next = ListNode(value % 10, null)
            node.next = next
            node = next

            head1 = head1?.next
            head2 = head2?.next
        }

        if (carryover > 0) {
            val next = ListNode(carryover, null)
            node.next = next
        }

        return start.next
    }
}