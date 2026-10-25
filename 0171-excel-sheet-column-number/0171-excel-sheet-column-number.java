class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int count = 0;

        for(int i = 0; i< n; i++){
            count = count*26 + (columnTitle.charAt(i) - 'A' +1);
        }
        return count;
    }
}