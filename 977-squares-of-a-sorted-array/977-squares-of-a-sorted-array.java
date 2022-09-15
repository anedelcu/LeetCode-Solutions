class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while(left <= right) {
            if(nums[left] * nums[left] >= nums[right] * nums[right]) {
                squares[index] = nums[left] * nums[left];
                left++;
            }
            else {
                squares[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return squares;
    }
}