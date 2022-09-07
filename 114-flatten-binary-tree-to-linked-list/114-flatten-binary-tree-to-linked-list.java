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
    public void flatten(TreeNode root) {
        flattenRec(root);
    }
    private static void flattenRec(TreeNode curr) {
        if(curr == null ) {
            return;
        }
        if(curr.left == null && curr.right == null) {
            return;
        }
        if(curr.left != null) {
            flattenRec(curr.left);
            TreeNode temp = curr.right;
            curr.right = curr.left;
            curr.left = null;
            TreeNode node = curr.right;
            while(node.right != null) {
                node = node.right;
            }
            node.right = temp;
        }
        flattenRec(curr.right);
    }
}