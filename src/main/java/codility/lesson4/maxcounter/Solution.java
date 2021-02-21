package codility.lesson4.maxcounter;

class Solution {

    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int temp = 0;
        int max = 0;
        for (int j : A) {
            if (1 <= j && j <= N) {
                if (result[j - 1] < max) {
                    result[j - 1] = max;
                }
                result[j - 1] += 1;
                temp = Math.max(temp, result[j - 1]);
                continue;
            }
            if (j == N + 1) {
                max = temp;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < max) {
                result[i] = max;
            }
        }

        return result;
    }
}
