class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for(long i= 1; i<=n; i*= 10){
            long divisor = i *10;

            count += (n / divisor) * i + Math.min(Math.max(n % divisor - i + 1,  0) ,i);
        }
        return count;
    }
}
