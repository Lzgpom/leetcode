package pt.lzgpom.interview.randomizedseto1

class RandomizedSet {

    private val values = ArrayList<Int>()
    private val valuesIndex = HashMap<Int, Int>()

    fun insert(value: Int): Boolean {
        if (contains(value)) {
            return false
        }

        values.add(value)
        valuesIndex[value] = values.lastIndex
        return true
    }

    fun remove(value: Int): Boolean {
        if (!contains(value)) {
            return false
        }

        val index = valuesIndex[value]!!
        valuesIndex[values.last()] = index
        values[index] = values.last()
        values.removeLast()
        valuesIndex.remove(value)

        return true
    }

    fun getRandom(): Int {
        return values.random()
    }

    fun contains(value: Int): Boolean {
        return valuesIndex.contains(value)
    }

}