/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if( lists == null)return null;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(new NodeComparator());
        for(ListNode node : lists)
        {
            if(node != null)q.offer(node);
        }
        
        while(!q.isEmpty())
        {
            
            tail.next = q.poll();
            tail = tail.next;
            //Because you only add head of every list to the heap. We need to iterate all nodes
            
            if(tail.next != null)
            {
                q.offer(tail.next);
            }
        }
        return head.next;               
    }
    class NodeComparator implements Comparator<ListNode>{
        public int compare(ListNode l1, ListNode l2){
            if(l1.val > l2.val)return 1;
            else if(l1.val <l2.val) return -1;
            else return 0;
        }
            
    }
}