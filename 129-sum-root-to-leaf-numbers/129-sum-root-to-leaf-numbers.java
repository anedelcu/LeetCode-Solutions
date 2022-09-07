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
    public int sumNumbers(TreeNode root) {
        return sumNumbersRec(root, 0);
    }
    
    private int sumNumbersRec(TreeNode curr, int sum) {
        if(curr == null) {
            return 0;
        }
        
        sum = 10 * sum + curr.val;
        if(curr.left == null && curr.right == null) {
            return sum;
        }
        return sumNumbersRec(curr.left, sum) + sumNumbersRec(curr.right, sum);
    }
}