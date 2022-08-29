class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "";
            
        for( char ch : arr) {
            if(isVowel(ch)) {
                vowels += ch;
            }
        }
        if(vowels.length() ==0) {
            return s;
        }
        int j = vowels.length() - 1;
        String res = "";
        for( char ch : arr) {
            if(isVowel(ch)) {
                ch = vowels.charAt(j);
                j--;
            }
            res += ch;
        }
        return res;
        
    }
    private boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}