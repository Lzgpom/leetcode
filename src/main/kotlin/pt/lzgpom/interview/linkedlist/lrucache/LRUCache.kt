package pt.lzgpom.interview.linkedlist.lrucache

class LRUCache(private val capacity: Int) {

    private val entries = HashMap<Int, Node>()

    private var first = Node(-1, -1, null, null)
    private var last = first

    fun get(key: Int): Int {
        val node = entries[key]

        if (node != null) {
            moveNodeToFirst(node)
            return node.value
        }

        return -1
    }

    fun put(key: Int, value: Int) {
        val node = entries[key]

        if (node != null) {
            moveNodeToFirst(node)
            node.value = value
            return
        }

        addNode(key, value)
    }

    private fun moveNodeToFirst(node: Node) {
        if (node == first) {
            return
        }

        node.prev?.next = node.next
        node.next?.prev = node.prev

        if (node == last) {
            last = node.prev!!
        }

        first.prev = node

        node.prev = null
        node.next = first

        first = node
    }

    private fun addNode(key: Int, value: Int) {
        val node = Node(key, value, null, first)
        first.prev = node
        first = node

        entries[key] = node

        if (entries.size >= capacity) {
            val toRemove = last.key
            last = last.prev!!
            last.next = null

            entries.remove(toRemove)
        }
    }

    private class Node(val key: Int, var value: Int, var prev: Node?, var next: Node?)
}