class Solution {
    public int fib(int n) {
        int act = 1;
        int prev = 0;
        int i = 2;
        if(n == 0) return 0;
        while(i <= n) {
            int temp = act;
            act = act + prev;
            prev = temp;
            i++;
        }
        return act;
        
    }
}