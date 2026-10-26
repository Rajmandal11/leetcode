class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int count =0;

        if(word.length()>sequence.length()) {
            return 0; 
        }
        StringBuilder sb  = new StringBuilder(word);

        while(sequence.contains(sb.toString())){
            count ++;
            sb.append(word);
        }
        return count;
    }
}