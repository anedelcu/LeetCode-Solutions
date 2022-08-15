/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        Stack<TreeNode> stackO = new Stack<>();
        Stack<TreeNode> stackC = new Stack<>();
        
        stackO.add(original);
        stackC.add(cloned);
        while(!stackO.isEmpty()) {
            TreeNode nodeO = stackO.pop();
            TreeNode nodeC = stackC.pop();
            
            if(nodeO == target) {
                return nodeC;
            }
            
            if(nodeO.left != null) {
                stackO.add(nodeO.left);
                stackC.add(nodeC.left);
            }
            if(nodeO.right != null) {
                stackO.add(nodeO.right);
                stackC.add(nodeC.right);
            }
        }
        return null;
    }
}