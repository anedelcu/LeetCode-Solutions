class Solution {
    public int lengthOfLastWord(String s) {
        boolean foundSpaceInside = false;
        int start = 0;
        int end = s.length() - 1;

        while(true) {
            if (s.charAt(end) != ' '){
                break;
            }else {
                end--;
            }

        }
        System.out.println("end: " + end);
        start = end;
        while(foundSpaceInside == false && start >= 0) {
            if(s.charAt(start) != ' ') {
                start--;
            }
            else {
                break;
            }
        }
        if(end == 0) {
            return 1;
        }
        
        return end - start;
    }
}