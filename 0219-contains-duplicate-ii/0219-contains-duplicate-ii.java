class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        int start = 0; //l left side of sliding window
        for (int end = 0; end < nums.length; end++) {  //r right side of sliding window
            if (!set.add(nums[end])) {
                return true;
            }
            start = end - k;
            if (start >= 0) {
                set.remove(nums[start]);
            }
        }
        return false;
    }
}