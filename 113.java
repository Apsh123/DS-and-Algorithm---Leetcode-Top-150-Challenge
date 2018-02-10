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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        pathSum(root, sum, list, lists);
        return lists;
    }
    
    public void pathSum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> lists)
    {
        if(root == null)return;
        list.add(root.val);
        if(root.left == null && root.right == null && sum - root.val ==0){
            lists.add(new ArrayList<>(list));
            
        }else{
            pathSum(root.left, sum - root.val, list, lists);
            pathSum(root.right, sum - root.val, list, lists);
            
        }
        list.remove(list.size()-1);
        
    }
}