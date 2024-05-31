package pt.lzgpom.interview.linkedlist

class LinkedListUtils {

    companion object {
        fun createLinkedListFromList(list: List<Int>, pos: Int = -1): ListNode? {
            if (list.isEmpty()) {
                return null
            }

            val head = ListNode(list.first(), null)
            var current = head

            var last: ListNode? = null

            for (i in 1..list.lastIndex) {
                val node = ListNode(list[i], null)
                current.next = node
                current = node

                if (i == list.lastIndex) {
                    last = node
                }
            }

            if (pos >= 0 && pos < list.size) {
                var cycleNode = head
                for (i in 0 .. pos) {
                    cycleNode = cycleNode.next!!
                }

                last?.next = cycleNode
            }

            return head
        }
    }
}