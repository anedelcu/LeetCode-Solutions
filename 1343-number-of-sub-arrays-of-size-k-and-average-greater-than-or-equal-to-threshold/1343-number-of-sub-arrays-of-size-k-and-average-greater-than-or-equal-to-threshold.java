class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int sum = 0;
        int count  = 0;
        for(int end = 0; end < arr.length; end++) {
            sum += arr[end];
            if(end  >= k - 1) {
                if(sum / k >= threshold) {
                    count++;
                }
                sum -= arr[start];
                start++;
            }
        }
        return count;
    }
}