class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1) {
            return "";
        }
        char[] chs = palindrome.toCharArray();
        boolean onlyA = true;
        int n =  palindrome.length();
        for(int i = 0; i < n - 1; i++) {
            if(n % 2 != 0 && i == n / 2) {
                continue;
            }
            
            if(chs[i] != 'a') {
                onlyA = false;
                chs[i] = 'a';
                break;
            }
        }
        if(onlyA && chs[palindrome.length() -1] == 'a') {
            chs[palindrome.length() -1] = 'b';
        }
        return new String(chs);
    }
}