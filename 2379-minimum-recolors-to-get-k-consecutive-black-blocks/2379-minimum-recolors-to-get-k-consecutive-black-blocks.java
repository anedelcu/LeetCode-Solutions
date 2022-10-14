class Solution {

    public int minimumRecolors(String blocks, int k) {
        int countB = 0, max = 0;
        int n = blocks.length();
        for (int i = 0; i < n; i++) {
            if (blocks.charAt(i) == 'B') {
                countB++;
            }
            if (i >= k) {
                if (blocks.charAt(i - k) == 'B') {
                    countB--;
                }
            }
            max = Math.max(max, countB);
        }
        return k - max;
    }
}
