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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                if(level % 2 == 0) {
                    levelNodes.add(0, curr.val);
                }
                else {
                    levelNodes.add(curr.val);
                }
                if(curr.left != null) {
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
            result.add(levelNodes);
            level++;
        }
        
        return result;
    }
}