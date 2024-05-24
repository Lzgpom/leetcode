package pt.lzgpom.interview.hashmap.groupanagrams

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramGroups = HashMap<Int, MutableList<String>>()
        strs.forEach { anagramGroups.addToList(it.toUnorderedHash(), it) }

        return anagramGroups.values.toList()
    }

    private fun <K, V> HashMap<K, MutableList<V>>.addToList(key: K, value: V) {
        val list = computeIfAbsent(key) { _ -> ArrayList() }
        list.add(value)
    }

    private fun String.toUnorderedHash(): Int {
        val arr = IntArray(26){0}
        for(c in this) arr[c - 'a']++
        return arr.contentHashCode()
    }
}