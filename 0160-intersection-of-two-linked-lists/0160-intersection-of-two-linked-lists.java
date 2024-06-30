/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode A = headA;
        ListNode B = headB;
        while (A != null) {
            set.add(A);
            A = A.next;
        }
        
        while (B != null) {
            if (set.contains(B)) {
                return B;
            }
            B = B.next;
        }
        
        return null;
    }
}