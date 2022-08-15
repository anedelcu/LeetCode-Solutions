/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        

        return evaluate(root);
    }
    
    public boolean evaluate(TreeNode root) {
        
        if(root.left == null && root.right == null) {
            return root.val== 1 ? true : false; 
        }
        else {
            return root.val == 2 ? (evaluate(root.left) | evaluate(root.right)) : (evaluate(root.left) & evaluate(root.right));
        }
    }
}