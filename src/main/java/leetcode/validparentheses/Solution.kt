package leetcode.validparentheses

import java.util.*

class Solution {

    fun isValid(s: String): Boolean {
        val stack: Stack<Char> = Stack<Char>()


        for (i in s.indices) {

            if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
                stack.push(s[i])
                continue
            }

            if (stack.isEmpty()) {
                return false
            }

            val stackChar = stack.pop()
            if ((stackChar == '(' && s[i] != ')') || (stackChar != '(' && s[i] == ')')) {
                return false
            }

            if ((stackChar == '{' && s[i] != '}') || (stackChar != '{' && s[i] == '}')) {
                return false
            }

            if ((stackChar == '[' && s[i] != ']') || (stackChar != '[' && s[i] == ']')) {
                return false
            }

        }

        return stack.isEmpty()
    }
}

fun main() {
    println(Solution().isValid("["))
}