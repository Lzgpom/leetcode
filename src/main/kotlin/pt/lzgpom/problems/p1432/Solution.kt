package pt.lzgpom.problems.p1432

class Solution {
    fun maxDiff(num: Int): Int {
        val stringed = num.toString()

        val digitInMinToReplace = stringed.find {it != '1' && it != '0'}
        val min = if(digitInMinToReplace != null) {
            if (digitInMinToReplace != stringed.first()) {
                stringed.replace(digitInMinToReplace, '0').toInt()
            } else {
                stringed.replace(digitInMinToReplace, '1').toInt()
            }
        } else {
            num
        }

        val digitInMaxToReplace = stringed.find {it != '9'}
        val max = if(digitInMaxToReplace != null) {
            stringed.replace(digitInMaxToReplace, '9').toInt()
        } else {
            num
        }

        return max - min
    }
}