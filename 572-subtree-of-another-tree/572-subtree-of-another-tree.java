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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
            return false;
        if(root.val==subRoot.val) {
            if(same(root,subRoot))
                return true; //If tree and subtree is same then return true else move further to child nodes.
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public static boolean same(TreeNode tree1, TreeNode tree2) {
        if(tree1 == null && tree2 == null) {
            return true;
        }
        if(tree1 == null || tree2 == null) {
            return false;
        }
        if(tree1.val != tree2.val) {
            return false;
        }
        return same(tree1.left, tree2.left) && same(tree1.right, tree2.right);
    }
}