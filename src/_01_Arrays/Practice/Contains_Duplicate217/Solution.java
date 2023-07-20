package _01_Arrays.Practice.Contains_Duplicate217;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        // Create a set to store unique elements
        Set<Integer> uniqueNums = new HashSet<>();
//        Set<Integer> uniqueNums = new TreeSet<>();

        // Iterate over the array
        for (int num : nums) {
            // If the current element is already in the set, it's a duplicate
            if (uniqueNums.contains(num)) {
                return true;
            }
            // Add the current element to the set
            uniqueNums.add(num);
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1));  // Output: true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2));  // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums3));  // Output: true
    }
}
