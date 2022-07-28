class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap sMap = new HashMap<>();
        HashMap tMap = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0 ; i < s.length(); i++) {
            int val = 1;
            if(!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), 1);
            }
            else {
                val = (int)sMap.get(s.charAt(i));
                val++;

                sMap.put(s.charAt(i), val) ;
            }
        }
        for(int i = 0 ; i < t.length(); i++) {
            int val = 1;
            if(!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), 1);
            }
            else {
                val = (int)tMap.get(t.charAt(i));
                val++;

                tMap.put(t.charAt(i), val) ;
            }
        }
        return sMap.equals(tMap);
    }
}