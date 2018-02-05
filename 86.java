/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
     if(head == null) return head;
     
     ListNode dummy1 = new ListNode(0);
     ListNode dummy2 = new ListNode(0);
     ListNode end=dummy2;
     ListNode start=dummy1;
     ListNode curr = head;
        
     while(curr!= null)
     {
         ListNode next = curr.next;
         curr.next = null;
         if(curr.val < x){
             start.next = curr;
             start = curr;
         }else{
             end.next = curr;
             end = curr;
         }
         curr =next;
     }
     start.next = dummy2.next;
     return dummy1.next;
    }
}