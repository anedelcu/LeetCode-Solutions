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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSumRec(root, targetSum, path, allPaths);
        return allPaths;
    }
    
    private void pathSumRec(TreeNode curr, int targetSum, List<Integer> path, List<List<Integer>> allPaths) {
        if(curr == null) {
            return;
        }
        
        path.add(curr.val);
        if(curr.left == null && curr.right == null && curr.val == targetSum) {
            allPaths.add(new ArrayList<>(path));
        } 
        else {
            pathSumRec(curr.left, targetSum - curr.val, path, allPaths);
            pathSumRec(curr.right, targetSum - curr.val, path, allPaths);
        }
        path.remove(path.size() - 1);
    }
}