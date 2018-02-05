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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        if(root == null) return true;
        TreeNode prev = null;
        //s.push(root.val);
        
        while(root != null || !s.isEmpty())
        {
            while(root != null)
            {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            if(prev != null && root.val <= prev.val)return false;
            prev = root;
            root = root.right;
            
            
        }
        return true;
    }
}