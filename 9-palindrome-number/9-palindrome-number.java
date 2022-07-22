class Solution {
    public boolean isPalindrome(int x) {
        int[] didgitsOfNumber = new int[10];
        int sizeOfNumber = 0;
        
        if(x < 0) {
            return false;
        }

        while(x != 0) {
            didgitsOfNumber[sizeOfNumber] = x % 10;
            x = x /10;
            sizeOfNumber++;
        }
        
        int i = 0;
        int j = sizeOfNumber - 1;
        while (i < j) {
            if (didgitsOfNumber[i] != didgitsOfNumber[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}