class Solution {
    public boolean isNumber(String s) {
        if (s == null ) {
            return false;
        }

        return s.trim().matches(
            "[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?"
        );
    }
}