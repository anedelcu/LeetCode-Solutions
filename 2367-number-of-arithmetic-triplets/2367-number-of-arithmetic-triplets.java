class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> values = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int diffValue=nums[i]-diff;
            if (values.contains(diffValue)
                    && values.contains(diffValue- diff))
                count++;
            values.add(nums[i]);
        }
        return count;
    }
}