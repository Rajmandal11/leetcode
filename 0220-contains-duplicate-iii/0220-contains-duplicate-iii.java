class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        TreeSet<Long> map = new TreeSet<>();

        if(n == 0 || indexDiff < 0 || valueDiff  <0){
            return false;
        }

        for(int i = 0; i<n; i++){
            long current  = (long) nums[i];

            Long k = map.ceiling(current -  valueDiff);

            if(k != null && k <= current +  valueDiff){
                return true;
            }
            map.add(current);
            if (i >= indexDiff) {
                map.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}