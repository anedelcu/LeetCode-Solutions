class Solution {
    public int divisorSubstrings(int num, int k) {
        int res = 0;
        String s = String.valueOf(num);
        for(int i = 0; i <= s.length() - k; i++) {
            int n = Integer.valueOf(s.substring(i, i + k));
            if(n == 0) {
                continue;
            }
            if(num % n == 0) {
                res++;
            }
        }
        return res;
    }
}