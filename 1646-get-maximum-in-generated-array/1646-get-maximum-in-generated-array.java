class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];
        
        nums[0] = 0;
        if(n == 0) {
            return 0;
        }
        nums[1] = 1;
        int max = 0;
        for( int i = 0; 2 * i < n + 1; i++) {
            if(2 * i <= n) {
                nums[ 2 * i] = nums[i];
                if(nums[i] > max) {
                    max = nums[i];
                }
            } 
            if(2 * i + 1 <= n) {
                nums[ 2 * i + 1] = nums[i] + nums[i + 1];
                if(nums[i] + nums[i + 1] > max) {
                    max = nums[i] + nums[i + 1];
                }
            } 
            
            
        }
        for(int num : nums) {
            System.out.print(num + " ");
        }
        return max;
    }
}