package pt.lzgpom.interview.graphgeneral.evaluatedivision

class Solution {
    fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
        val graph = createGraph(equations, values)
        val results = DoubleArray(queries.size)

        for (i in queries.indices) {
            results[i] = calculateEquationWithGraph(queries[i][0], queries[i][1], graph)
        }

        return results
    }

    private fun createGraph(equations: List<List<String>>, values: DoubleArray): Map<String, Node> {
        val graph = HashMap<String, Node>()

        for (i in equations.indices) {
            val node1 = createNodeInGraph(graph, equations[i][0])
            val node2 = createNodeInGraph(graph, equations[i][1])

            node1.edges.add(Edge(values[i], node2))
            node2.edges.add(Edge(1 / values[i], node1))

            graph[node1.name] = node1
            graph[node2.name] = node2
        }

        return graph
    }

    private fun createNodeInGraph(graph: Map<String, Node>, name: String): Node {
        return graph[name] ?: Node(name)
    }

    private fun calculateEquationWithGraph(var1: String, var2: String, graph: Map<String, Node>): Double {
        val seenNodes = HashSet<Node>()

        fun dfs(node: Node, current: Double, objective: String): Double {
            if (node.name == objective) {
                return current
            }

            if (seenNodes.contains(node)) {
                return -1.0
            }

            seenNodes.add(node)

            for (edge in node.edges) {
                val branchValue = dfs(edge.node, current * edge.value, objective)

                if (branchValue != -1.0) {
                    return branchValue
                }
            }

            return -1.0
        }

        val startNode = graph[var1] ?: return -1.0

        val dummy = Node(".")
        dummy.edges.add(Edge(1.0, startNode))

        return dfs(dummy, 1.0, var2)
    }

    class Node(val name: String) {
        val edges: MutableList<Edge> = ArrayList()
    }

    data class Edge(val value: Double, val node: Node)
}