package codility.lesson6.numberofdiskintersections;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        int result = 0;
        long[] starts = new long[A.length];
        long[] ends = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            starts[i] = i - (long) A[i];
            ends[i] = i + (long) A[i];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int count = 0;
        int endIndex = 0;
        for (long start : starts) {
            while (start > ends[endIndex]) {
                --count;
                ++endIndex;
            }
            result += count;
            ++count;
            if (result > 10_000_000) {
                return -1;
            }
        }
        return result;
    }
}
