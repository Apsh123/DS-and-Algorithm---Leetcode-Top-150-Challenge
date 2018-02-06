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
    static int preIndex =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return treeBuild(preorder, inorder,  0, inorder.length-1);        
        
    }
    
    public TreeNode treeBuild(int[] pre, int[] in,  int inStart, int inEnd){
        
        if(inStart > inEnd || preIndex > pre.length-1) return null;
        
        TreeNode tNode = new TreeNode(pre[preIndex++]);
        System.out.println(tNode.val);
        if(inStart == inEnd)return tNode;
        
        int inIndex = search(in, inStart, inEnd, tNode.val);
        
        tNode.left = treeBuild(pre, in,  inStart, inIndex-1);
        tNode.right = treeBuild(pre, in,  inIndex +1, inEnd);
        
        return tNode;
    }
    public int search(int[] in, int start, int end, int val){
        int i;
        for(i = start; i <= end; i++){
            if (in[i] == val)return i;
        }
        return i;
        
    }
    
}