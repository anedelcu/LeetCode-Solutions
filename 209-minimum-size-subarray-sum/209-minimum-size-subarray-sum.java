class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum  = 0;
        int res = Integer.MAX_VALUE;
        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while(sum >= target) {
                res = Math.min(res, end - start + 1);
                sum -= nums[start];
                start++;
            }
            
        }
        return res == Integer.MAX_VALUE? 0 : res;
    }
}