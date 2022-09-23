class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> dnaFreq = new HashMap();
        if(s.length()<=10)
            return new ArrayList<String>();
        StringBuilder sb = new StringBuilder(s.substring(0,10));
        
        dnaFreq.put(sb.toString(), 1);
        List<String> res = new ArrayList<String>();
        for(int i = 10 ; i < s.length() ; i++)
        {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            String str = sb.toString();
            dnaFreq.put(str, dnaFreq.getOrDefault(str, 0)+1);
            if(dnaFreq.get(str) > 1 && !res.contains(str))
                res.add(str);
        }
        return res;
    }
}