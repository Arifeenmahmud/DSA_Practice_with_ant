package _01_Arrays.Practice.Longest_Common_Prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {

                    return commonPrefix.toString();
                }
            }

            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(strs2)); // Output: ""
    }
}
