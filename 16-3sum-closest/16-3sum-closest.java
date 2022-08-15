class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i ++) {
            int low = i + 1;
            int high = nums.length - 1;

            while(low < high) {
                int currSum = nums[i] + nums[low] + nums[high];
                if(currSum < target) {
                    low++;
                }
                else {
                    high--;
                }
                if(Math.abs(currSum - target) < Math.abs(sum -  target)) {
                    sum = currSum;
                }
            }
        }
        return sum;

    }
}