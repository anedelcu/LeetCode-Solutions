class Solution {

    public boolean wordPattern(String pattern, String s) {
        String sub[] = s.split(" ");
        if (sub.length != pattern.length()) {
            return false;
        }
        HashMap<String, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sub.length; i++) {
            set.add(pattern.charAt(i));
            if (map.containsKey(sub[i]) == false) {
                map.put(sub[i], pattern.charAt(i));
            } else if (map.get(sub[i]) != pattern.charAt(i)) {
                return false;
            } else {
                continue;
            }
        }

        if (set.size() == map.size()) {
            return true;
        } else {
            return false;
        }
    }
}
