package leetcode.besttimetobuyandsellstock

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var result = 0

        for (i in prices.indices) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            } else if (prices[i] - minPrice > result) {
                result = prices[i] - minPrice
            }
        }
        return result
    }
}


