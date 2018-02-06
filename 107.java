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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root == null)return lists;
        
        q.offer(root);
        while(!q.isEmpty())
        {
            int level = q.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i< level; i++)
            {
                
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right); 
            }
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
        
    }
}