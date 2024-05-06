package pt.lzgpom.interview.longestcommonprefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]

        for (i in 1 until strs.size) {
            prefix = prefix.commonPrefixWith(strs[i])
        }

        return prefix
    }
}