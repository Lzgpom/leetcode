package pt.lzgpom.interview.linkedlist.linkedlistcycle

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        head?: return false

        var slow = head.next
        var fast = head.next?.next

        while (fast != null) {
            if (slow == fast) {
                return true
            }

            slow = slow?.next
            fast = fast.next?.next
        }

        return false
    }
}