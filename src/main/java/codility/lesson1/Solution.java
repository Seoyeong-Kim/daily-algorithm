package codility.lesson1;

public class Solution {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int max = 0;
        int count = 0;
        boolean open = false;
        for (char character : binaryString.toCharArray()) {
            if (character == '1') {
                if(open) {
                    max = Math.max(count, max);
                    count = 0;
                } else {
                    open = true;
                }
            }

            if (character == '0' && open) {
                count++;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(9));
        System.out.println(new Solution().solution(529));
        System.out.println(new Solution().solution(20));
        System.out.println(new Solution().solution(15));
        System.out.println(new Solution().solution(1041));
        System.out.println(new Solution().solution(144));

    }
}
