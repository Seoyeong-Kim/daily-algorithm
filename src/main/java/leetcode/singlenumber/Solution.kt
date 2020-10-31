package leetcode.singlenumber

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val numberSet = mutableSetOf<Int>()

        nums.forEach {
            if(numberSet.contains(it)) {
                numberSet.remove(it)
            } else{
                numberSet.add(it)
            }
        }

        return numberSet.first()
    }
}

fun main() {
    Solution().singleNumber(intArrayOf(4, 1, 2, 1, 2))
}