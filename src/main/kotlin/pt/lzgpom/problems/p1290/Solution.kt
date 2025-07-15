package pt.lzgpom.problems.p1290

import pt.lzgpom.interview.linkedlist.ListNode

class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var result = 0

        var curr = head
        while(curr != null) {
            result = (result shl 1) + curr.`val`
            curr = curr.next
        }

        return result
    }
}