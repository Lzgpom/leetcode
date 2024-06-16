package pt.lzgpom.interview

class TestNameUtils {
    companion object {
        fun Boolean.notOrEmpty(): String {
            if(this) {
                return ""
            }

            return "not"
        }
    }
}