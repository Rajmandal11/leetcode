class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> hset = new HashSet<Character>();

        
        for(int i =0; i< s.length(); i++){
            char character = s.charAt(i);

            if(hset.contains(character)){
                count +=2;
                hset.remove(character);
            }else{
                hset.add(character);
            }
            
        }
        if(hset.size() >0){
            count ++;
        }
        return count;
    }
}