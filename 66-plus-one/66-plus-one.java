class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        while(last >= 0) {
            if(digits[last] < 9) {
            digits[last]++;
            break;
            }
            else {
                digits[last] = 0;
                last--;
            }
        }
        if (last == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < result.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        }
        
        
        return digits;
        
    }
}