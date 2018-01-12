/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n == 0)return head;
        
        ListNode curr = head;
        int len = 0;
        while(curr != null)
        {
            len += 1;
            curr = curr.next;
        }
        //System.out.println(len);
        int pivot = len - n;
        //System.out.println();
        if(pivot == 0)return head.next;
        ListNode tail = head;
        while (pivot > 1 && tail.next != null)
        {
            tail = tail.next;
            pivot--;
        }
        tail.next = tail.next.next;
        return head;
        
    }
}