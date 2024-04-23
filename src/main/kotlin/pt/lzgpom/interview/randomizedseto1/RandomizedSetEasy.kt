package pt.lzgpom.interview.randomizedseto1

class RandomizedSetEasy {

    private val values = HashSet<Int>()

    fun insert(value: Int): Boolean {
        return values.add(value)
    }

    fun remove(value: Int): Boolean {
        return values.remove(value)
    }

    fun getRandom(): Int {
        return values.random()
    }
}