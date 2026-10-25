class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int [] current = new int [n+1];
        current[0] = 1;
        int ans =0;
        int t =0; // Number of odd elements encountered so far

        for(int v : nums){
            t += v&1; // check number is odd or even.
            if(t -k >=0){
                ans += current[t-k];
            }
            current[t]++;
        }
        return ans;
    }

}