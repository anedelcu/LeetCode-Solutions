class Solution {
    public boolean checkInclusion( String pattern, String str) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        int start = 0;

        for(char c: pattern.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            if(map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) - 1);
                if(map.get(c) == 0) {
                    count++;
                }
            }

            if(count == map.size()) {
                return true;
            }
            if(end >= pattern.length() - 1) {
                char leftChar = str.charAt(start++);
                if(map.containsKey(leftChar)) {
                    if(map.get(leftChar) == 0) {
                        count--;
                    }
                    map.put(leftChar, map.getOrDefault(leftChar, 0) + 1);
                }
                //start++;
            }
        }
        return false;
    }
}