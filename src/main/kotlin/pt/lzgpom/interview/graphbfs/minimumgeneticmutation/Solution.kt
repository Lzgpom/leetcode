package pt.lzgpom.interview.graphbfs.minimumgeneticmutation

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun minMutation(startGene: String, endGene: String, bank: Array<String>): Int {
        val remainingGenes = bank.toHashSet()

        val queue: Queue<Pair<String, Int>> = LinkedList()
        queue.add(startGene to 0)

        while (queue.isNotEmpty()) {
            val (currentGene, count) = queue.poll()

            val remainingGenesIterator = remainingGenes.iterator()
            while (remainingGenesIterator.hasNext()) {
                val gene = remainingGenesIterator.next()

                if (isMutation(currentGene, gene)) {
                    if (gene == endGene) {
                        return count + 1
                    }

                    queue.add(gene to count + 1)
                    remainingGenesIterator.remove()
                }
            }
        }

        return -1
    }

    fun isMutation(gene1: String, gene2: String): Boolean {
        if (gene1.length != gene2.length) {
            return false
        }

        var hasGeneMutation = false
        for (i in gene1.indices) {
            if (gene1[i] != gene2[i]) {
                if (hasGeneMutation) {
                    return false
                }

                hasGeneMutation = true
            }
        }

        return hasGeneMutation
    }
}