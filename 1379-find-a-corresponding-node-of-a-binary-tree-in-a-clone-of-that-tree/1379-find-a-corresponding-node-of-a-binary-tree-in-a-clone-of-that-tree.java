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
    TreeNode res , target;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inOrder(original, cloned);
        return res;
    }
    
    public void inOrder(TreeNode t1, TreeNode t2) {
        if(t1 == null) {
            return;
        }
        inOrder(t1.left, t2.left);
        if(t1 == target) {
            res = t2;
        }
        inOrder(t1.right, t2.right);
    }
}