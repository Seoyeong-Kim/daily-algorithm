package codility.lesson5.countdiv;

public class Solution {
    public int solution(int A, int B, int K) {
        int result = B % K == 0 ? 1 : 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                return B / K - i / K + 1;
            }
        }

        return result;
    }
}
