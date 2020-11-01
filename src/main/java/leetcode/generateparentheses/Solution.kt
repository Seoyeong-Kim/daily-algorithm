package leetcode.generateparentheses


class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val answer = arrayListOf<String>()
        backtrack(answer, "", 0, 0, n)

        return answer
    }

    private fun backtrack(answer: ArrayList<String>, current: String, open: Int, close: Int, max: Int) {

        if (current.length == max * 2) {
            answer.add(current)
            return
        }

        if (open < max) {
            backtrack(answer, "$current(", open + 1, close, max)
        }

        if (close < open) {
            backtrack(answer, "$current)", open, close + 1, max)

        }
    }
}


fun main() {
    Solution().generateParenthesis(5)
}