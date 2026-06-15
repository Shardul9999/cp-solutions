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
    public ListNode ReverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head = ReverseLL(head);
        ListNode curr = head;
        while(curr != null ){
            while(curr.next != null && curr.val > curr.next.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return ReverseLL(head);
    }
}