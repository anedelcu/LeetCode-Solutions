class Solution {
    public int climbStairs(int n) {
        int waysPrev = 1, waysNext = 1;
        for(int i =1;i<n;i++){
            int temp = waysNext;
            waysNext +=waysPrev;
            waysPrev = temp;
        }
        return waysNext;
    }
}