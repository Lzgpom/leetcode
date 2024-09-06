package pt.lzgpom.interview.divideconquer.mergeksortedlists

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }

        if (lists.size == 1) {
            return lists[0]
        }

        var mergeInterval = 1
        while (mergeInterval < lists.size) {
            for (i in 0 .. lists.lastIndex step mergeInterval * 2) {
                val left = lists[i]
                val right = if (i + mergeInterval < lists.size) lists[i + mergeInterval] else null
                lists[i] = merge(left, right)
            }

            mergeInterval *= 2
        }

        return lists[0]
    }

    private fun merge(left: ListNode?, right: ListNode?): ListNode? {
        val head = ListNode(0)
        var current = head
        var pLeft = left
        var pRight = right

        while (pLeft != null && pRight != null) {
            if (pLeft.`val` < pRight.`val`) {
                current.next = pLeft
                current = pLeft
                pLeft = pLeft.next
            } else {
                current.next = pRight
                current = pRight
                pRight = pRight.next
            }
        }

        if (pLeft != null) {
            current.next = pLeft
        }

        if (pRight != null) {
            current.next = pRight
        }

        return head.next
    }
}