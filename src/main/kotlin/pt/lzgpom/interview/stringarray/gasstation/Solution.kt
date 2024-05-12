package pt.lzgpom.interview.stringarray.gasstation

class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var netGain = 0

        var currentStart = 0
        var currentNetGain = 0

        for (i in gas.indices) {
            if (currentNetGain < 0) {
                currentStart = i
                currentNetGain = 0
            }

            val stationNetGain = gas[i] - cost[i]
            netGain += stationNetGain
            currentNetGain += stationNetGain
        }

        return if (netGain >= 0) {
            currentStart
        } else {
            -1
        }
    }
}