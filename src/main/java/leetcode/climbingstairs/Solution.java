package leetcode.climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        int[] numberOfWays = new int[n + 1];
        numberOfWays[0] = 1;
        numberOfWays[1] = 2;

        if (n < 2) {
            return numberOfWays[n - 1];
        }

        for (int i = 2; i <= n; i++) {
            numberOfWays[i] = numberOfWays[i - 2] + numberOfWays[i - 1];

        }

        return numberOfWays[n - 1];
    }
}
