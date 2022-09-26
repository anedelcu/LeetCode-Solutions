class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<String>((s1, s2) -> s1.length() != s2.length() ? s1.length() - s2.length() : s1.compareTo(s2));
        
        for(int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek().toString();
        
    }
}