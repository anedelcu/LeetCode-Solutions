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
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        maxDepth(root);
        return isBalanced;
        
    }
    
    private int maxDepth(TreeNode root) {     
        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left) + 1;
        int rightHeight = maxDepth(root.right) + 1;
        if(Math.abs(rightHeight - leftHeight) > 1)
            isBalanced = false; 
        return Math.max(leftHeight,rightHeight);
    }
}