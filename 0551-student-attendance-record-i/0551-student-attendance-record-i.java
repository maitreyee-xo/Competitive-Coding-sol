class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int consecutiveLateCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                absentCount++;
                if (absentCount >= 2)   return false;
                consecutiveLateCount = 0;
            } else if (ch == 'L') {
                consecutiveLateCount++;
                if (consecutiveLateCount >= 3)  return false;
            } else  consecutiveLateCount = 0;
        }
        return true;
    }
}
