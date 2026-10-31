public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        
        // Loop n-1 times to build the next sequence step
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            
            // Go through the current string digit by digit
            for (int j = 0; j < result.length(); j++) {
                // If the next digit is the same, just increase the count
                if (j + 1 < result.length() && result.charAt(j) == result.charAt(j + 1)) {
                    count++;
                } else {
                    // When the digit changes, write down the count and the digit
                    next.append(count).append(result.charAt(j));
                    count = 1; // Reset count for the next group
                }
            }
            result = next.toString();
        }
        
        return result;
    }
}
