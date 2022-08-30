class Solution {
    public String reversePrefix(String word, char ch) {
        char [] arr = word.toCharArray();
        if(word.indexOf(ch) == -1) {
            return word;
        }
        else {
            int start = 0;
            int end = word.indexOf(ch);
            reverse(arr, start, end);
        }
        return new String(arr);
        
    }
    private void reverse(char[] arr, int start, int end) {
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }
}