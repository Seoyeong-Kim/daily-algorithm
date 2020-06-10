package leetcode.nondecreasingarray

class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        var prePreNumber = 0
        var preNumber = nums[0]

        var isModified = false
        for (i in 1 until nums.size) {
            if(prePreNumber <= preNumber && (preNumber <= nums[i])) {
                prePreNumber = preNumber
                preNumber = nums[i]
                continue
            }

            if (isModified) {
                return false
            }

            isModified = true

            if (prePreNumber > preNumber) {
                nums[i] = preNumber
            }

            if (preNumber > nums[i]) {
                if(prePreNumber <= nums[i]) {
                    preNumber = prePreNumber
                }
                if(prePreNumber > nums[i]) {
                    nums[i] = preNumber
                }
            }

            prePreNumber = preNumber
            preNumber = nums[i]
        }
        return true
    }
}

fun main() {
    val s = Solution()
    println(s.checkPossibility(intArrayOf(0,1,2,3,5,4,6,7,8,9)))
}