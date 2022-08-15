class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        
        
        for(int i = 0; i < n - 2; i ++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i -1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];
                
                while(low < high) {
                    if(nums[low] + nums[high] == sum) {
                        resList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        low++;
                        /*
                        List<Integer> res = new ArrayList<>();
                        res.add(nums[i]);
                        res.add(nums[low]);
                        res.add(nums[high]);
                        resList.add(res);
                        */
                        while(low < high && nums[low] == nums[low - 1]) {
                            low++;
                        }
                        
                    }
                    else if(nums[low] + nums[high] > sum) {
                        high--;
                    }
                    else {
                        low++;
                    }       
                }
            }
        }
        
        return resList;
    }
}