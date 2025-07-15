package pt.lzgpom.problems.p2410

class Solution {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        players.sort()
        trainers.sort()

        var count = 0
        var i = players.lastIndex
        var j = trainers.lastIndex

        while (i >= 0 && j >= 0) {
            if (players[i] <= trainers[j]) {
                    count++
                    i--
                    j--
                } else {
                i--
            }
        }

        return count
    }
}