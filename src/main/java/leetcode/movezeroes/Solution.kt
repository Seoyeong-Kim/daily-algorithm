package leetcode.movezeroes

import java.util.*

class Solution {
    fun moveZeroes(nums: IntArray) {
        var zeroCount = 0
        val queue = LinkedList<Int>()
        nums.forEach {
            if (it == 0) {
                zeroCount++
            } else {
                queue.add(it)
            }
        }

        var index = 0
        while (!queue.isEmpty()) {
            nums[index] = queue.poll()
            index++
        }

        (0 until zeroCount).forEach {
            nums[index + it] = 0
        }
    }
}

fun main() {
    Solution().moveZeroes(intArrayOf(0, 1, 0, 3, 12))
}
