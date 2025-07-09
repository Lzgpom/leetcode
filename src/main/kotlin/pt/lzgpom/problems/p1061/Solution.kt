package pt.lzgpom.problems.p1061

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {
        val graph = Array(GRAPH_SIZE) { BooleanArray(GRAPH_SIZE) }
        populateGraph(s1, s2, graph)

        val result = StringBuilder()
        for (char in baseStr) {
            result.append(smallestChar(char, graph))
        }

        return result.toString()
    }

    private fun populateGraph(s1: String, s2: String, graph: Array<BooleanArray>) {
        val n = s1.length

        for (i in 0 until n) {
            val char1 = s1[i].value()
            val char2 = s2[i].value()

            graph[char1][char2] = true
            graph[char2][char1] = true
        }
    }

    private fun smallestChar(char: Char, graph: Array<BooleanArray>): Char {
        val visited = BooleanArray(GRAPH_SIZE)
        val queue: Queue<Int> = LinkedList()
        queue.offer(char.value())

        while (queue.isNotEmpty()) {
            val current = queue.poll()
            visited[current] = true

            for (i in 0 until GRAPH_SIZE) {
                if (graph[current][i]) {
                    if (!visited[i]) {
                        queue.offer(i)
                    }
                }
            }
        }

        return MAX_CHAR - visited.indexOfLast { it }
    }

    private fun Char.value(): Int {
        return MAX_CHAR - this
    }

    companion object {
        const val MAX_CHAR = 'z'
        const val GRAPH_SIZE = 'z' - 'a' + 1
    }
}