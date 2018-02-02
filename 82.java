/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode prev = start;
        prev.next = head;
        ListNode curr = head;
        
        while(curr != null)
        {
            while( curr.next != null && curr.val == curr.next.val)
            {
                curr = curr.next;
            }
            
                if(prev.next == curr)
                {
                    //curr = curr.next;
                    prev = prev.next;
                }else
                {
                    prev.next = curr.next;
                    //curr = curr.next;
                }
            curr = curr.next;
            }
        
        return start.next;
        
        
    }
}