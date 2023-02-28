class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length == 0) return "";
        String [] str = new String[nums.length];
        for(int i = 0; i < nums.length;i++)
        {
            str[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(str, new Comparator<String>()
                    {
                        public int compare(String a, String b)
                        {
                            String order1 = a+b;
                            String order2 = b+a;
                            return order2.compareTo(order1);
                        }
                    });
        if(str[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String s : str)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}