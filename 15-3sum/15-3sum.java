class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res =new LinkedList<>();
        for(int i=0;i<nums.length;i++){
		//when numbers are same
            if(i>0&& nums[i]==nums[i-1])
                continue;
            
            int l=i+1,r =nums.length-1;
            while(r>l){
                int threeSum= nums[i]+nums[l]+nums[r];
				//reduce right pointer
                if(threeSum>0)
                    r--;
				//reduce left pointer
                else if(threeSum <0)
                    l++;
                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
					//Find the next non repeating element
                    while (nums[l]==nums[l-1] && l<r)
                        l++;
                }
            }
            
        }
        return res;
    }
}