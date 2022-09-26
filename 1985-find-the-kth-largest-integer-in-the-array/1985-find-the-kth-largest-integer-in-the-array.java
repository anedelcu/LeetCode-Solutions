class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> s1.length() != s2.length() ? s1.length() - s2.length() : s1.compareTo(s2));
        
        for(int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
            if(nums[i].length() == minHeap.peek().length() && nums[i].compareTo(minHeap.peek()) >= 0) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
            else if(nums[i].length() > minHeap.peek().length()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        
        return minHeap.peek();
        
    }
}