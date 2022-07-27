class Solution {
    public int mySqrt(int x) {
        int n = 1;
        while( x / (n * n) >= 1) {
            n++;
        }
        return n -1;
        
    }
}