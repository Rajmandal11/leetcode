class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int read = 0;

        for(int i = 0; i<n; i++){
            if(i+1 == n || chars[i] != chars[i+1]){
                chars[write ++] = chars[i];
                int count =  i - read +1 ;

                if(count > 1){
                    for(char digits : String.valueOf(count).toCharArray()){
                        chars[write++] = digits;
                    }
                }
                read = i+1;
            }
        }
        return write;
    }
}