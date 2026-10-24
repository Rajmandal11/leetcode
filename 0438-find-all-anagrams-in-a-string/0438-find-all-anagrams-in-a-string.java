class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if(n < k){
            return res;
        }
        int [] count = new int [26];
        for(int i = 0; i< k; i++){
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;

        }
       
        if(Arrays.equals(count, new int[26])){
            res.add(0);
        }
        for(int i =k; i<n; i++){
            count[s.charAt(i) - 'a']++;
            count[s.charAt(i - k) - 'a']--;

            if(Arrays.equals(count, new int[26])){
                res.add(i-k+1);
            }
        }

        return res;


    }
}