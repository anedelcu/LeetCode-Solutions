class Solution {
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                open++;
            }
            else {
                open--;
            }
            
            if(c != ')') {
                close++;
            }
            else {
                close--;
            }
            if(close < 0) break;
            open = Math.max(open, 0);
        }
        return open == 0;
    }
}