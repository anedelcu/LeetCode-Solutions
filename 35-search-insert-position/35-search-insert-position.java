class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        if(target > nums[last]) {
            return nums.length;
        }
        if(target < nums[0] || first == last) {
            return 0;
        }
        if(target == nums[first]) {
            return first;
        }
        
        while(first < last) {
            int mid = (first + last + 1) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(first + 1 == last) {
                return last;
            }
            else if(target > nums[mid]) {
                first = mid;
            }
            else {
                last = mid;
            }
        }
        return -1;

    }
}