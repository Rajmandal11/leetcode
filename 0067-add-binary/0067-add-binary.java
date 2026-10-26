import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Parse strings using base 2
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        // Add them together
        BigInteger sum = num1.add(num2);

        // Convert the BigInteger sum back to a radix-2 (binary) string
        return sum.toString(2);
    }
}
