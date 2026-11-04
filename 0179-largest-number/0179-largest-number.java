import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        
        // 1. Convert the integer array to a String array
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        
        // 2. Sort strings using a custom comparator
        // If s1 + s2 is greater than s2 + s1, s1 should come first
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        
        // 3. Edge case: If the largest number is "0", the result is just "0"
        if (arr[0].equals("0")) {
            return "0";
        }
        
        // 4. Build the final largest number string
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}
