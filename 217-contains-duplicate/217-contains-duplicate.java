class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            mySet.add(nums[i]);
        }
        System.out.println(mySet.size());
        return mySet.size() != nums.length;
        
    }
}