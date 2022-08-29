class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); 
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            while(left < arr.length && !isVowel(arr[left])) {
                left++;
            }
            while(right >= 0 && !isVowel(arr[right])) {
                right--;
            }
        
            if(left < right){
                swap(arr,left, right);
                left++;
                right--;
            }
        }        
        
        return new String(arr);
    }
    private void swap (char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private boolean isVowel(char c) {
        String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;
    }
}