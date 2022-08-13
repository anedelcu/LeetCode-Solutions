class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList<>();
        
        if (n == 0)
            return list;
        
        int smallest = nums[0];
        
        for (int i = 1; i < n; i++) {
            if (nums[i] - 1 != nums[i - 1]) {
                if (smallest == nums[i - 1])
                    list.add(Integer.toString(smallest));
                else 
                    list.add(smallest + "->" + nums[i - 1]);
                
                smallest = nums[i];
            }
        }
        
        if (smallest == nums[n - 1])
            list.add(Integer.toString(smallest));
        else 
            list.add(smallest + "->" + nums[n - 1]);
        
        return list;
    }
}