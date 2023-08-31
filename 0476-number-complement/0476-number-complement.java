class Solution {
    public int findComplement(int num) {
        if(num == 1) return 0;
        if(num == 0) return 1;
        ArrayList<Integer> v = new ArrayList<Integer>();
        while (num != 0) {
            v.add(num % 2);
            num /= 2;
        }
         Collections.reverse(v);
         for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == 0)
                v.set(i, 1);
            else
                v.set(i, 0);
        }
        int two = 1;
        for (int i = v.size() - 1; i >= 0; i--) {
            num = num + v.get(i) * two;
            two = two * 2;
        }
        return num;
    }
}