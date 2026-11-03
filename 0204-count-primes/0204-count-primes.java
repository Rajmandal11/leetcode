class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isComposite = new boolean[n];

        if(n == 0 || n == 1){
            return 0;
        }
        for(int i =2; i *i < n; i++){
            if(!isComposite[i]){
                for(int j = i*i; j<n; j +=i){
                    isComposite[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }
        return count;
    }
}