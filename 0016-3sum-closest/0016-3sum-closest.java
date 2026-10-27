class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if ( nums == null ){
            return  0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans =0;


        for(int i =0; i<n; i++){
            int a = nums[i];
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = a + nums[left] + nums[right];
                int diff = Math.abs(sum - target);

                if(diff< min){
                    min = diff;
                    ans = sum;
                }
                if(sum < target){
                    left ++;

                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }

        return ans;
    }
}