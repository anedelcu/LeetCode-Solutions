class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int num : nums) {
            int n = subsets.size();
            for(int i = 0; i < n; i++) {
                List<Integer> set = new ArrayList<Integer>(subsets.get(i));
                set.add(num);
                if(!subsets.contains(set)) {
                    subsets.add(set);
                }
                    
            }
        }
        return subsets;
        
    }
}