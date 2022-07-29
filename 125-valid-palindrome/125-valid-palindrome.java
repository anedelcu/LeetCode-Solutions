class Solution {
    public boolean isPalindrome(String s) {
        String ls = s.toLowerCase();

        String nps = "";
        String rs = "";
        for(int i = 0; i < ls.length(); i++) {
            if( (ls.charAt(i) >= 'a' && ls.charAt(i) <= 'z') || (
                ls.charAt(i) >= '0' && ls.charAt(i) <= '9')) {
                nps += ls.charAt(i);

            }
        }


        for (int i = nps.length() -1; i >= 0; i--) {
            rs += nps.charAt(i);

        }
        
        return rs.equals(nps);
    }
}