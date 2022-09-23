class Solution {
    public String longestNiceSubstring(String s) {
        String result = "";
        // take first index, go from 0 to length-1 of the string
		for (int i = 0;i<s.length(); i++){        
            // take second index, this should go up to the length of the string <=
			for (int j = i+1;j<=s.length(); j++){
                //get the substring for the index range from i to j
				String temp = s.substring(i, j);
                // if length of the substring should be greater than 1
				// if the length should be greater that the previous computed result
				// if the substring is valid Nice String
				// then update the result with the current substring from range i and j
				if (temp.length() > 1 && result.length() < temp.length() && isNice(temp)) 
                    result = temp;
            }    
        }
        return result;
    }
    
    public boolean isNice(String s) {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) {
            set.add(ch);
        }
        for (char ch : set) {
            if (set.contains(Character.toUpperCase(ch)) != set.contains(Character.toLowerCase(ch))) {
                return false;  
            }
        }
        return true;
    }
}