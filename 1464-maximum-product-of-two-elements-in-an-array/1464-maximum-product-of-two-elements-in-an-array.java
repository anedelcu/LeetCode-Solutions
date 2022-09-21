class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        
        minHeap.add(nums[0]);
        minHeap.add(nums[1]);
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        int num1 =  minHeap.poll() - 1;
        int num2 = minHeap.poll() -1;
        return num1 * num2;
    }
}