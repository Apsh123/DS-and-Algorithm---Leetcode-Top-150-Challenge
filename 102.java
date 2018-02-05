/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root==null) return lists;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i =0; i < level; i++){
                if(q.peek().left!= null)q.offer(q.peek().left);
                if(q.peek().right!= null)q.offer(q.peek().right);
                list.add(q.poll().val);
                //q.pop();
            }
            lists.add(list);
        }
        
        return lists;
        
        
        
        
    }
}