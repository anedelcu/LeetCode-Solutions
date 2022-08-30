class Solution {
    public String reverseStr(String s, int k) {
        int i = 0;
        char[] arr = s.toCharArray();
        int left = 0;
        while(left < s.length()) {
            int right = left + k;
            if(right >= s.length()) {
                reverse(arr, left, s.length() - 1);
            }
            else {
                reverse(arr, left, right - 1);  
            }
            left = right + k;
        }
        return new String(arr);
    }
    
    private void reverse(char[] arr, int left, int right) {
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}