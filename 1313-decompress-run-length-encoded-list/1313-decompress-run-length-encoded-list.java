class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int freqs = 0;
        for(int i = 0; i < nums.length; i+=2) {
            freqs += nums[i];
        }
        int [] res = new int[freqs];
        int k = 0;
        for(int i = 0; i < nums.length - 1; i+=2) {
            for(int j = 0; j < nums[i]; j++) {
                res[k] = nums[i + 1];
                k++;
            }
        }
        return res;
    }
}