class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        for (int i = 2; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev1 = s.charAt(i-1);
            char prev2 = s.charAt(i-2);
            if (curr != prev1 && curr != prev2 && prev1 != prev2)
                ans++;
        }
        return ans;
    }
}