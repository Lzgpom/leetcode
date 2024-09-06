package pt.lzgpom.interview.linkedlist

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(`val`: Int, next: ListNode?) : this(`val`) {
        this.next = next
    }

    override fun toString(): String {
        return `val`.toString()
    }

    fun toList(): List<Int> {
        val list = mutableListOf(`val`)
        var node = this

        while (node.next != null) {
            node = node.next!!
            list.add(node.`val`)
        }

        return list
    }

    companion object {
        fun toList(head: ListNode?): List<Int> {
            return head?.toList() ?: listOf()
        }
    }
}