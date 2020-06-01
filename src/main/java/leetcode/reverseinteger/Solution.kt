package leetcode.reverseinteger

class Solution {
    fun reverse(x: Int): Int {

        val isMinus = x < 0

        var reversed = 0

        try {
            reversed = x.toString()
                    .reversed()
                    .filter { char -> char != '-' }
                    .toInt()
        } catch (e: NumberFormatException) {
            return reversed
        }


        if (isMinus) reversed = -reversed

        return reversed
    }
}


fun main() {
    val s = Solution()
    println(s.reverse(1534236469))
}