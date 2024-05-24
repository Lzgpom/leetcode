package pt.lzgpom.interview.hashmap.isomorphicstrings

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val letterCorrespondenceMap = HashMap<Char, Char>()
        val lettersUsed = HashSet<Char>()

        for (i in s.indices) {
            val correspondence = letterCorrespondenceMap[s[i]]

            if (correspondence == null) {
                if(lettersUsed.contains(t[i])) {
                    return false
                }

                letterCorrespondenceMap[s[i]] = t[i]
                lettersUsed.add(t[i])
            } else {
                if (correspondence != t[i]) {
                    return false
                }
            }
        }

        return true
    }
}