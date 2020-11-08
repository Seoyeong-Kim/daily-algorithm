package leetcode.majorityelement

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        nums.forEach {
            if(map.contains(it)) {
                map[it] = map[it]!! + 1
            }

            if(!map.contains(it)) {
                map[it] = 1
            }
        }
        var resultEntry : MutableMap.MutableEntry<Int, Int>? = null
        map.entries.forEach {
            if(resultEntry == null || it.value > resultEntry!!.value) {
                resultEntry = it
            }
        }

        return resultEntry!!.key
    }
}