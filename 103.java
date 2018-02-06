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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root == null) return lists;
        q.offer(root);
        int index =1;
        while(!q.isEmpty()){
            int level = q.size();
            
            List<Integer> list = new ArrayList<>();
            
        for(int i =0; i < level; i++){
            
            if(q.peek().left  != null)q.offer(q.peek().left);
            if(q.peek().right != null)q.offer(q.peek().right);
            list.add(q.poll().val);
            
            }
        if(index %2 != 0){
        lists.add(list);
        //index += 1;
        }else{
            Collections.reverse(list);
            lists.add(list);
          //  index+=1;
        }
            index ++;
    }
        return lists;
}
}