class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(myMap.containsKey(nums[i])) {
                myMap.put(nums[i], 2);
            }
            else {
                myMap.put(nums[i], 1);
            }

        }
        System.out.println(myMap.toString());
        for(int key : myMap.keySet()) {
            if(myMap.get(key) == 1) {
                return key;
            }
        }
        System.out.println(myMap.toString());
        return -1;
    }
}