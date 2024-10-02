/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dumm = new ListNode(0);
        dumm.next=head;
        ListNode prev = null;
        ListNode curr=head;
        ListNode b = dumm;

        for(int i=0;i<left-1;i++){
            curr=curr.next;
            b=b.next;
        }
        
        ListNode a = curr;
        
        for(int i=0;i<=right-left;i++){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        
        b.next=prev;
        a.next=curr;
        return dumm.next;
    }  
}