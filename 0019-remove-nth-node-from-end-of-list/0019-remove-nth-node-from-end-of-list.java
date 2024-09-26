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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode temp=head;
        while(temp!=null){
            count++;
        temp=temp.next;
        }
        int targetIndex = count - n;
        if (targetIndex == 0) {
            return head.next;
        }
        ListNode ansHead=head;
        for(int i=1;i<targetIndex;i++){
            head=head.next;
        }
        head.next=head.next.next;
        return ansHead;
    }
}