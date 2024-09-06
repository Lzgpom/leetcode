package pt.lzgpom.interview.divideconquer.sortlist

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }

        val mid = findMiddle(head)
        var left = head
        var right = mid.next
        mid.next = null

        left = sortList(left)
        right = sortList(right)

        return merge(left, right)
    }

    private fun merge(left: ListNode?, right: ListNode?): ListNode? {
        if (right == null) {
            return left
        }

        val head = ListNode(0)
        var current = head

        var cLeft: ListNode? = left
        var cRight: ListNode? = right

        while (cLeft != null && cRight != null) {
            if (cLeft.`val` < cRight.`val`) {
                current.next = cLeft
                current = cLeft

                cLeft = cLeft.next
            } else {
                current.next = cRight
                current = cRight

                cRight = cRight.next
            }
        }

        if (cLeft != null) {
            current.next = cLeft
        }

        if (cRight != null) {
            current.next = cRight
        }

        return head.next
    }

    private fun findMiddle(head: ListNode): ListNode {
        var slow = head
        var fast = head.next

        while (fast?.next?.next != null) {
            fast = fast.next?.next
            slow = slow.next!!
        }

        return slow
    }

    private fun sortListWithQuickSort(head: ListNode?): Pair<ListNode?, ListNode?> {
        if (head == null) {
            return null to null
        }

        if (head.next == null) {
            return head to head
        }

        val smaller = ListNode(0)
        val bigger = ListNode(0)

        var current = head.next
        var currentSmaller = smaller
        var currentBigger = bigger

        while (current != null) {
            if (current.`val` > head.`val`) {
                currentBigger.next = current
                currentBigger = current
            } else {
                currentSmaller.next = current
                currentSmaller = current
            }

            val tmp = current
            current = current.next
            tmp.next = null
        }

        val (smallHead, smallTail) = sortListWithQuickSort(smaller.next)
        val (bigHead, bigTail) = sortListWithQuickSort(bigger.next)

        smallTail?.next = head
        head.next = bigHead

        val newHead = smallHead ?: head
        val newTail = bigTail ?: head

        return newHead to newTail
    }
}