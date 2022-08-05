class Solution {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(myMap.containsKey(nums[i])) {
                myMap.put(nums[i],myMap.get(nums[i]) + 1 );
            }
            else {
                myMap.put(nums[i], 1);
            }
        }
        int majElem = 0;
        for(int key : myMap.keySet()){
            if(myMap.get(key) > nums.length / 2) {
                majElem = key;
            }
        }
        return majElem;
    }
}