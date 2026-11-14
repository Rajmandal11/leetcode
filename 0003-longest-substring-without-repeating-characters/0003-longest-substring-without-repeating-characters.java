class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0;
        int j =0;
        int [] target = new int[128];

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);

            j = Math.max(j, target[ch]);
            count = Math.max(count, i-j+1);
            target[ch] = i+1;
        }
        return count;
    }
}