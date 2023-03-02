class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        char prev = chars[0];
        sb.append(prev);
        int count = 1;
        for(int i = 1; i < chars.length;i++)
        {
            int j = i;
            while(j < chars.length && chars[j] == prev)
            {
                j++; count++;
            }
            if(count > 1) sb.append(count);
            if(j == chars.length) break;
            prev = chars[j];
            sb.append(prev);
            i = j;
            count = 1;
        }
        for(int i = 0; i < sb.length();i++)
        {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}