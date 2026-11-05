class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        
        for(int i=0; i<k; i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u'){
                count ++;
            }
        }
        int best = count;

        for(int i = k; i<n; i++){
            char c = s.charAt(i - k);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u'){
                count --;
            }

            char ch = s.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u'){
                count ++;
            }
            best = Math.max(best, count);
        }
        return best;
    }
}