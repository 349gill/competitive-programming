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
    public ListNode reverseList(ListNode head) {
        ListNode p1 = head, p2 = null;
        while (p1 != null) {
            ListNode temp = p1.next;
            p1.next = p2;
            p2 = p1;
            p1 = temp;
        }
        return p2;
    }
}