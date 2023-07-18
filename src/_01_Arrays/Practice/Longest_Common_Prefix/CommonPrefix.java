package _01_Arrays.Practice.Longest_Common_Prefix;

public class CommonPrefix {
    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(commonPrefix.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(commonPrefix.longestCommonPrefix(strs2)); // Output: ""

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0]; // Initialize prefix to first string in array

        for (int i = 1; i<strs.length;i++){
            while (strs[i].indexOf(prefix) !=0){
               prefix = prefix.substring(0, prefix.length()-1);
            }

        }
        return prefix;
    }


}

