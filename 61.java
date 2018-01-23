 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head ==null || head.next == null || k == 0)return head;
        int len = 1;
        ListNode curr = head;
        
        while(curr.next != null)
        {
            len += 1;
            curr = curr.next;
        }
        //System.out.println(len);
        if (len == k) return head;
        int pivot = (len > k) ? len-k :len-k%len;
        //System.out.println(pivot);
        curr.next = head;
        
       
        ListNode tail = head;
        while (pivot > 1)
        {
            tail = tail.next;
            pivot--;
        }
        head = tail.next;
        tail.next = null;
        
        return head;
        
    }
}