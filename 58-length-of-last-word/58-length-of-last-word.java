class Solution {
    public int lengthOfLastWord(String s) {
        
        String sTrimmed = s.trim();
        int size = 0;
        for (int i = 0; i < sTrimmed.length(); i++) {
            if(sTrimmed.charAt(i) == ' ') {
                size = 0;
            }
            else {
                size++;
            }
        }
        return size;
    }
}