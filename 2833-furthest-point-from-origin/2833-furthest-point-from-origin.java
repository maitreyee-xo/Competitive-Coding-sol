class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int noOfRights = 0;
        int noOfLefts = 0;
        int blanks = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                noOfLefts++;
            } else if (ch == 'R') {
                noOfRights++;
            } else {
                blanks++;
            }
        }

        return Math.abs(noOfRights - noOfLefts) + blanks;
    }
}
