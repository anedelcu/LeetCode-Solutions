class Solution {
    public int evalRPN(String[] tokens) {
        Stack <String> stack = new Stack();
        //Queue <String> q = new PriorityQueue();
        String operands = "+-*/";
        for(String s : tokens) {
            if(operands.indexOf(s) == -1) {
                stack.push(s);
            } 
            else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int res = operation(a,b,s);
                stack.push(res + "");
            }
        }
        return Integer.valueOf(stack.pop());
    }
    
    private int operation(int a, int b, String operand) {
        if(operand.equals("+")) return a + b;
        else if(operand.equals("-")) return b - a;
        else if(operand.equals("*")) return a * b;
        else return b / a;
    }
}