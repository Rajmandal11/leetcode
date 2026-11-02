class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        StringBuilder sb = new StringBuilder();

        if(n == 0 || m == 0){
            return 0;
        }

        for(int i = 0; i<= n -m; i++){
            if(haystack.substring(i, i + m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}