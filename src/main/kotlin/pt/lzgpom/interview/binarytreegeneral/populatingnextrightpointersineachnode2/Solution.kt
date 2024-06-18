package pt.lzgpom.interview.binarytreegeneral.populatingnextrightpointersineachnode2

class Solution {
    fun connect(root: Node?): Node? {
        var currentHead = root

        while (currentHead != null) {
            currentHead = connectLevel(currentHead)
        }

        return root
    }

    private fun connectLevel(head: Node?): Node? {
        var current = head

        var nextHead: Node? = null
        var nextCurrent: Node? = null

        while (current != null) {
            if (current.left != null) {
                if (nextCurrent == null) {
                    nextHead = current.left
                    nextCurrent = current.left
                } else {
                    nextCurrent.next = current.left
                    nextCurrent = nextCurrent.next
                }
            }

            if (current.right != null) {
                if (nextCurrent == null) {
                    nextHead = current.right
                    nextCurrent = current.right
                } else {
                    nextCurrent.next = current.right
                    nextCurrent = nextCurrent.next
                }
            }

            current = current.next
        }

        return nextHead
    }

    class Node(var `val`: Int) {
        var left: Node? = null
        var right: Node? = null
        var next: Node? = null

        override fun toString() = `val`.toString()
    }
}