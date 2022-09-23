class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = 0;
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++)
        { 
            for(; j <= i + k && j < nums.length; j++)
            {
                if(s.contains(nums[j]))
                    return true;
                s.add(nums[j]);
            }
            s.remove(nums[i]);
        }
        return false;
    }
}