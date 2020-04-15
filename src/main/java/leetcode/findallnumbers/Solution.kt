package leetcode.findallnumbers

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        return (1 .. nums.size).filterNot { nums.contains(it) }
    }
}