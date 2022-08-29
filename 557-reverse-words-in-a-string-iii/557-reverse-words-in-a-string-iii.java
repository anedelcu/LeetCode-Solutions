class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int n = s.length();
        char[] arr = s.toCharArray();
        while(left < n) {
            int right = left + 1;
            while(right < n && arr[right] != ' ') {
                right++;
            }
            reverseWord(arr, left, right - 1);
            left = right + 1;
        }
        return new String(arr);
    }
    
    public void reverseWord(char[] arr, int left, int right) {
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}