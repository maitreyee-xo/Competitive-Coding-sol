class Solution {
    public String reverseWords(String s) {
       String[] str = s.split(" ");
        List stringList = new ArrayList<>();
        for (String s1 : str) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = s1.length() - 1; i >= 0; i--) {
                stringBuilder.append(s1.charAt(i));
            }
            stringList.add(stringBuilder.toString());
        }
        return String.join(" ", stringList);
    }
}