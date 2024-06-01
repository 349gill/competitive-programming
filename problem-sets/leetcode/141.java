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
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p1 = head, p2 = p1.next;

        while (p1 != p2) {
            if ((p1 == null) || (p2 == null)) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
            if (p2 == null) {
                return false;
            }
            p2 = p2.next;
        }
        return true;
    }
}