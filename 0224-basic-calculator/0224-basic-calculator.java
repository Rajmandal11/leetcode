class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;

        for (char c : s.toCharArray()) {
            switch (c) {
                case '+':
                    result += sign * number;
                    number = 0;
                    sign = 1;
                    break;
                case '-':
                    result += sign * number;
                    number = 0;
                    sign = -1;
                    break;
                case '(':
                    stack.push(result);
                    stack.push(sign);
                    result = 0;
                    sign = 1;
                    break;
                case ')':
                    result += sign * number;
                    number = 0;
                    result *= stack.pop();
                    result += stack.pop();
                    break;
                case ' ':
                    break;
                default:
                    // Handles digits '0' through '9'
                    number = 10 * number + (c - '0');
                    break;
            }
        }

        return result + (sign * number);
    }
}
