/*
1) Simply removing all the leading whitespaces, and if index becomes greater than length it 
means string has only whitespaces
2) Checking the sign, if present
3) Now loop until the end of string and if any charcter except digit comes break the loop
4) Make the number, but also check if reaches beyond Integer limits [-2^31, 2^31-1].
5) If yes, then returns from there only, no need to iterate futher.
6) In the end return no. with the sign
*/
class Solution {
    public int myAtoi(String s) {
        long num = 0;
        int i = 0;
        while(i<s.length() && s.charAt(i) == ' ')
            i++;
        if(i == s.length())
            return 0;
        int sign = 1;
        if(s.charAt(i)== '-')
        {
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+')
            i++;
        while(i<s.length())
        {
            char ch = s.charAt(i);
            if(ch < 48 || ch > 57)
                break;
            num = num*10 + (ch - '0');
            i++;
            if(num*sign < Integer.MIN_VALUE)
            {
                num = Integer.MIN_VALUE;
                return (int)num*sign;
            }
            else if(num*sign > Integer.MAX_VALUE)
            {
                num = Integer.MAX_VALUE;
                return (int)num*sign;
            }
        }
        return (int)num*sign;
    }
}