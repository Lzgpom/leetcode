package pt.lzgpom.interview.linkedlist.partitionlist

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun partition(head: ListNode?, x: Int): ListNode? {
        var headSmaller: ListNode? = null
        var smaller: ListNode? = null

        var headBigger: ListNode? = null
        var bigger: ListNode? = null

        var current = head
        while (current != null) {
            if (current.`val` < x) {
                val (newHead, newLast) = setHeadOrAddToList(headSmaller, smaller, current)
                headSmaller = newHead
                smaller = newLast
            } else {
                val (newHead, newLast) = setHeadOrAddToList(headBigger, bigger, current)
                headBigger = newHead
                bigger = newLast
            }

            current = current.next
        }

        if (headSmaller == null) {
            return headBigger
        }

        smaller?.next = headBigger
        bigger?.next = null

        return headSmaller
    }

    private fun setHeadOrAddToList(head: ListNode?, last: ListNode?, node: ListNode): Pair<ListNode, ListNode> {
        if (head == null) {
            return node to node
        }

        last?.next = node
        return head to node
    }
}