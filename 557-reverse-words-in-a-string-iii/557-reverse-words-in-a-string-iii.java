class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = reverseWord(arr[i]);
            sb.append(arr[i]);
            if(i != arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    public String reverseWord(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}