/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && slow!=null && fast.next!=null) {
 
            slow = slow.next;
            fast = fast.next.next;
                       
            if(slow==fast){
                return true;
            }
            }
        
        return false;
    }
}

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         Set<ListNode> visited = new HashSet<>();
        
//         ListNode current = head;
        
//         while (current != null) {
//             if (visited.contains(current)) {
//                 return true;
//             }
//             visited.add(current);
//             current = current.next;
//         }
        
//         return false;
//     }
// }