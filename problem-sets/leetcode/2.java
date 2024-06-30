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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum = 0;
        ListNode result = new ListNode();
        ListNode head = result;
        
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            }
            else if  (l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            if (sum > 9) {
                result.next = new ListNode(sum % 10);
                carry = (sum) / 10;
            }
            else {
                result.next = new ListNode(sum);
                carry = 0;
            }
            result = result.next;
        }
        
        if (carry != 0) result.next = new ListNode(carry); 
        return head.next;
    }
}