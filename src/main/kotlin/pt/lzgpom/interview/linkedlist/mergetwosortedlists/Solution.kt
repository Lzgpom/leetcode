package pt.lzgpom.interview.linkedlist.mergetwosortedlists

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var head1 = list1
        var head2 = list2

        val start = ListNode(0, null)
        var merged = start

        while (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                if (head1.`val` < head2.`val`) {
                    merged = addNext(merged, head1)
                    head1 = head1.next
                } else {
                    merged = addNext(merged, head2)
                    head2 = head2.next
                }
            } else if (head1 != null) {
                merged = addNext(merged, head1)
                head1 = head1.next
            } else if (head2 != null) {
                merged = addNext(merged, head2)
                head2 = head2.next
            }
        }

        return start.next
    }

    private fun addNext(node: ListNode, next: ListNode): ListNode {
        node.next = next
        return next
    }
}