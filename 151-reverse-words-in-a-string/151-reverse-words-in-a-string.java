class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " " );
            sb.append(arr[i].trim());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}