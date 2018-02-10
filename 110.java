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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        
        return checkHeight(root) != -1;
        
    }
    
    public int checkHeight(TreeNode root)
    {
        if(root == null) return 0;
        
        int lh = checkHeight(root.left);
        if(lh == -1) return -1;
        
        int rh = checkHeight(root.right);
        if (rh ==-1) return -1;
        
        int HD = Math.abs(lh - rh);
        if(HD >1) return -1;
        else{
            return Math.max(lh, rh) + 1;
        }
    }
}