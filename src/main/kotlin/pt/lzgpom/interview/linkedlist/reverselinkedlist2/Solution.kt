package pt.lzgpom.interview.linkedlist.reverselinkedlist2

import pt.lzgpom.interview.linkedlist.ListNode
import java.util.Stack

class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val nodesToReverse = Stack<ListNode>()

        var index = 1
        var current = head

        val newHead = ListNode(0, head)
        var reverseStart: ListNode? = newHead

        while (index <= right) {
            if (index == left - 1) {
                reverseStart = current
            }

            if (index >= left) {
                nodesToReverse.push(current)
            }

            index++
            current = current?.next
        }

        val reverseEnd = current
        while (nodesToReverse.isNotEmpty()) {
            val oppositeNode = nodesToReverse.pop()
            reverseStart?.next = oppositeNode
            reverseStart = oppositeNode
        }

        reverseStart?.next = reverseEnd

        return newHead.next
    }
}