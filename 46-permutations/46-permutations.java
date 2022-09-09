class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteRec(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }
    
    private void permuteRec(int[] nums, int index, List<Integer> currPermut, List<List<Integer>> result) {
        if(currPermut.size() == nums.length) {
            result.add(currPermut);
        }
        else {
            for(int i = 0; i <= currPermut.size(); i++ ) {
                List<Integer> newPermut = new ArrayList<>(currPermut);
                newPermut.add(i, nums[index]);
                permuteRec(nums, index + 1, newPermut, result);
            }            
        }
    }
}