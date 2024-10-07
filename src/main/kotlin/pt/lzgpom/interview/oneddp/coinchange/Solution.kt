package pt.lzgpom.interview.oneddp.coinchange

import kotlin.math.min

class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val amountToCoins = IntArray(amount + 1) { amount + 1 }
        amountToCoins[0] = 0

        for (coin in coins) {
            for (i in coin..amount) {
                amountToCoins[i] = min(amountToCoins[i], amountToCoins[i - coin] + 1)
            }
        }

        return if (amountToCoins[amount] == amount + 1) {
            -1
        } else {
            amountToCoins[amount]
        }
    }
}