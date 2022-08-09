class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int maxSize = 0;
        for (int i = 0; i < s.length(); i++) {
            int size = 0;
            if(!sb.toString().contains("" + s.charAt(i))) {
                sb.append(s.charAt(i));
                System.out.println(sb.toString());
                size = sb.length();
            }
            else {
                sb.delete(0, sb.indexOf("" + s.charAt(i)) + 1);
                sb.append(s.charAt(i));
            }
            if (size > maxSize) {
                maxSize = size;
            }

        }
        return maxSize;
    }
}