class Solution {
    public boolean isPowerOfTwo(int n) {
        // base cases
        // '1' is the only odd number
        // which is a power of 2(2^0)
        if (n == 1)
            return true;
 
        // all other odd numbers are
        // not powers of 2
        else if (n % 2 != 0 || n == 0)
            return false;
 
        // recursive function call
        return isPowerOfTwo(n / 2);
    }
}