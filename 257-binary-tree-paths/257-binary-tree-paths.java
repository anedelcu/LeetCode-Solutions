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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        addPath(root, list, "");
        return list;
        
    }
    
    public void addPath(TreeNode root, List<String> list, String path){    
        
		if(root.left == null && root.right == null){     
			list.add(path + root.val);  }  
		if(root.left != null){         
			addPath(root.left, list, path + root.val + "->"); }   
		if(root.right !=null){     
			addPath(root.right, list, path + root.val + "->");
		}
	}
}