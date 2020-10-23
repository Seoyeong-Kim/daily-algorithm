package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException();
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> reverseNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            reverseNum.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int pairNumber = target - nums[i];
            if (reverseNum.containsKey(pairNumber) &&
                    i != reverseNum.get(pairNumber)) {
                return new int[]{i, reverseNum.get(pairNumber)};
            }
        }

        throw new IllegalArgumentException();
    }

}
