class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String curr = Integer.toString(i);
            int size = curr.length();
            if (size % 2 == 0) {
                int n = size / 2;
                int sum1 = 0;
                int sum2 = 0;
                for (int j = 0; j < n; j++)    sum1 += curr.charAt(j) - '0';
                for (int j = n; j < size; j++)  sum2 += curr.charAt(j) - '0';
                if (sum1 == sum2)  count++;
            }
        }
        return count;
    }
}
