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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head; 
        ListNode ans=head.next;
        ListNode prev = null;
        while(head!=null && head.next!=null){
            ListNode first = head;
            ListNode sec = head.next;
            first.next=sec.next;
            sec.next=first;
            if(prev!=null) prev.next=sec;
            prev=first;
            head=first.next;
        }
        return ans;
    }
}