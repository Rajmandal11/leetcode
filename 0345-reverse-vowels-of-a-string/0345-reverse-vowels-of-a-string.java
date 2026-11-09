class Solution {
    public String reverseVowels(String s) {
        // Convert string to char array since strings are immutable in Java
        char[] chars = s.toCharArray();
        
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move the left pointer until it hits a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            
            // Move the right pointer until it hits a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            // Move both pointers inward
            left++;
            right--;
        }
        
        return new String(chars);
    }
    
    // Helper method to quickly check for both lowercase and uppercase vowels
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
