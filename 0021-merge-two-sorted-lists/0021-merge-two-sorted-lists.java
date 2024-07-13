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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode();
        ListNode head3 = list3;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                head3.next=l2;
                l2=l2.next;
            }
            else{
                head3.next=l1;
                l1=l1.next;
            } 
            head3=head3.next;
        }
        if(l1==null){
            head3.next=l2;
        }
        else if(l2==null){
            head3.next=l1;
        }
        
        return list3.next;
    }
}