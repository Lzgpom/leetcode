package pt.lzgpom.interview.stack.simplifypath

import java.util.*

class Solution {
    fun simplifyPath(path: String): String {
        val pathStack = Stack<String>()

        val parts = path.split("/")
            .filter { it.isNotBlank() }

        for (part in parts) {
            if (part == "..") {
                if (pathStack.isNotEmpty()) {
                    pathStack.pop()
                }
            } else if (part != ".") {
                pathStack.push(part)
            }
        }

        return "/" + pathStack.joinToString("/")
    }
}