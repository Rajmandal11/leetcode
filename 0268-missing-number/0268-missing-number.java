public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Formula to find the sum of all numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // The difference is the missing number
        return expectedSum - actualSum;
    }
}
