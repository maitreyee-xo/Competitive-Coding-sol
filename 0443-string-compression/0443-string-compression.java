class Solution {
    public int compress(char[] chars) {
    int readPtr = 0;
    int writePtr = 0;
    int count = 1;
    
    for (int i = 1; i <= chars.length; i++) {
        if (i < chars.length && chars[i] == chars[i-1]) {
            count++;
        } else {
            chars[writePtr++] = chars[readPtr];
            
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (int j = 0; j < countStr.length(); j++) {
                    chars[writePtr++] = countStr.charAt(j);
                }
            }
            
            readPtr = i;
            count = 1;
        }
    }
    
    return writePtr;
}}