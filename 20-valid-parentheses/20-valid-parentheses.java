class Solution {
    public boolean isValid(String s) {
        // string empty -return true
        // ([]) - true
        // string contains only panathesis
        // 
        if(s.equals("")) {
            return true;
        }
        Stack<Character> stk = new Stack<>();
	        for(char ch : s.toCharArray()){
	            if(!stk.isEmpty() && ch == ')' && stk.peek() == '('){
	                stk.pop();
	            }else if(!stk.isEmpty() && ch == ']' && stk.peek() == '['){
	                stk.pop();
	            }else if(!stk.isEmpty() && ch == '}' && stk.peek() == '{'){
	                stk.pop();
	            }    
	            else {
	                stk.push(ch);
	            }
	        }
	        return stk.size() == 0;
    }
}