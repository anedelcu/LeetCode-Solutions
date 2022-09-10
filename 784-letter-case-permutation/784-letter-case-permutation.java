class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> permutations = new ArrayList<>();
        if(s == null) {
            return permutations;
        }
        
        permutations.add(s);
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                int n = permutations.size();
                for(int j = 0; j < n; j++) {
                    char[] ch = permutations.get(j).toCharArray();
                    if(Character.isLowerCase(ch[i])) {
                        ch[i] = Character.toUpperCase(ch[i]);
                    }
                    else {
                        ch[i] = Character.toLowerCase(ch[i]);
                    }
                    permutations.add(String.valueOf(ch));
                }
            }
        }
        return permutations;
        
    }
}