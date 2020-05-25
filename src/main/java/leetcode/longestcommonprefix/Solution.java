package leetcode.longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLength = getMinimumStringLength(strs);
        boolean collect = true;
        for (int i = 0; i < minLength; i++) {
            if(collect == false) {
                break;
            }
            Character firstStrs = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1) {
                    collect = false;
                    break;
                }

                if (firstStrs != strs[j].charAt(i)) {
                    collect = false;
                    break;
                }
            }

            if (collect) {
                sb.append(firstStrs);
            }
        }


        return sb.toString();
    }

    private int getMinimumStringLength(String[] strs) {
        if(strs.length == 0) {
            return 0;
        }

        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        return min;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        String result = s.longestCommonPrefix(new String[]{"aca","cba"});

        System.out.println(result);

    }
}
