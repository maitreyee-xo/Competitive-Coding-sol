class Solution {
    public String reverseWords(String s) {
        int j = 0;
        int i = 0;
        char[] array = s.toCharArray();
        while(i < s.length()){
            j = i;
            while(j < s.length() && array[j] != ' '){
                j++;
            }

            reverse(array, i, j - 1);
            i = j + 1;
        }

        return String.valueOf(array);
    }

    public void reverse(char[] num, int i, int j){

        while(i < j){
            char tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
            ++i;
            --j;
        }
    }
}