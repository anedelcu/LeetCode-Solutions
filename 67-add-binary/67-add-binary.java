class Solution {
public static String addBinary(String a, String b) {
        char remainder = '0';
        String s = "";
        int i = Math.max(a.length(), b.length()) - 1;
        if(a.length() > b.length() ) {
            for(int k = b.length(); k < a.length(); k++) {
                b = '0' + b;
            }
        }
        else if(a.length() < b.length() ) {
            for(int k = a.length(); k < b.length(); k++) {
                a = '0' + a;
            }
        }
        while( i >= 0) {
            if(a.charAt(i) == '0' && b.charAt(i) == '0' && remainder =='0') {
                s = '0' + s;
                i--;
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '0' && remainder =='0') {
                s = '1' + s;
                i--;
            }
            else if(a.charAt(i) == '0' && b.charAt(i) == '1' && remainder =='0') {
                s = '1' + s;
                i--;
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '1' && remainder =='0') {
                s = '0' + s;
                remainder = '1';
                i--;
            }
            else if(a.charAt(i) == '0' && b.charAt(i) == '0' && remainder =='1') {
                s = '1' + s;
                remainder = '0';
                i--;

            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '0' && remainder =='1') {
                s = '0' + s;
                remainder = '1';
                i--;
            }
            else if(a.charAt(i) == '0' && b.charAt(i) == '1' && remainder =='1') {
                s = '0' + s;
                remainder = '1';
                i--;
            }
            else {
                s = '1' + s;
                remainder = '1';
                i--;
            }
        }
        if(a.length() == b.length() && remainder == '1') {
            s = '1' + s;
        }

        return s;
    }
}