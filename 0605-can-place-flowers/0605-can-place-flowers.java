class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        
        for (int i = 0; i < m; i++) {
        
            if (flowerbed[i] == 0) {
                // Check if the left plot is empty or if we are at the beginning
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                // Check if the right plot is empty or if we are at the end
                boolean rightEmpty = (i == m - 1 || flowerbed[i + 1] == 0);
                
                // If both sides are empty, we can plant a flower here
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant the flower
                    n--;              // Decrement the remaining flowers needed
                    
                    // Optimization: If we've placed all flowers, return true early
                    if (n <= 0) {
                        return true;
                    }
                }
            }
        }
        
        return n <= 0;
    }
}
