class Solution {
    public String decodeAtIndex(String s, int k) {
        long totalSize = 0; // Use long to handle large numbers
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';
                totalSize *= digit;
            } else   totalSize++;
        }
        // Iterate through the characters in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                totalSize /= digit; // Calculate the size after repetition
                k %= totalSize;     // Update k for the remaining substring
            } else {
                if (k == 0 || k == totalSize)   return String.valueOf(c); // Current character is the answer
                totalSize--; // Decrease totalSize for a single character
            }
        }
        return ""; // This line should not be reached in a valid scenario
    }
}
