class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new LinkedList<>();
        permutations.add(new ArrayList<>());
        
        for(int num : nums) {
            int n = permutations.size();
            for(int i = 0; i < n; i++) {
                List<Integer> oldPermutation = permutations.poll();
                for(int j = 0; j <= oldPermutation.size(); j++) {
                    List<Integer> newPermutation = new ArrayList<Integer>(oldPermutation);
                    newPermutation.add(j, num);
                    if(newPermutation.size() == nums.length) {
                        result.add(newPermutation);
                    }
                    else {
                        permutations.add(newPermutation);
                    }
                }
            }
        }
        return result;
    }
}