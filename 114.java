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
    private static TreeNode prev = null;
    public void flatten(TreeNode root) {
        
        if(root == null)return;
        TreeNode right = root.right;
        TreeNode left = root.left;
        
        if(prev != null){
            prev.left = null;
            prev.right = root;
        }
        prev = root;
        flatten(left);
        flatten(right);
        
        
    }
}