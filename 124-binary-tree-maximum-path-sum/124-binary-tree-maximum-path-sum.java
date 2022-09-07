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
    private static int globalMax;
    public int maxPathSum(TreeNode root) {
        globalMax = Integer.MIN_VALUE;
        maxPathRecursive(root);
        return globalMax;
    }
    
    private int maxPathRecursive(TreeNode curr) {
        if(curr == null) {
            return 0;
        }
        int maxLeft = maxPathRecursive(curr.left);
        int maxRight = maxPathRecursive(curr.right);
        
        maxLeft = Math.max(maxLeft, 0);
        maxRight = Math.max(maxRight, 0);
        
        int localMaxSum = maxLeft + maxRight + curr.val;
        
        globalMax = Math.max(localMaxSum, globalMax);
        
        return Math.max(maxLeft, maxRight) + curr.val;
    }
}