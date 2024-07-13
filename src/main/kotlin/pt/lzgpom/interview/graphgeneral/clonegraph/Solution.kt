package pt.lzgpom.interview.graphgeneral.clonegraph

class Solution {
    fun cloneGraph(node: Node?): Node? {
        val clonedNodes = HashMap<Int, Node>()

        fun cloneNode(node: Node?): Node? {
            if (node == null) {
                return null
            }

            if (clonedNodes.contains(node.`val`)) {
                return clonedNodes[node.`val`]
            }

            val clone = Node(node.`val`)
            clonedNodes[node.`val`] = clone

            for (neighbor in node.neighbors) {
                clone.neighbors.add(cloneNode(neighbor))
            }

            return clone
        }

        return cloneNode(node)
    }

    class Node(var `val`: Int) {
        var neighbors: ArrayList<Node?> = ArrayList()
    }
}