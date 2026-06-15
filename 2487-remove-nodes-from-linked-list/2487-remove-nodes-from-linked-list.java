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
        int max = head.val;

        while(curr != null && curr.next != null){
           if(curr.next.val < max){
                curr.next = curr.next.next;
           }
           else{
                curr = curr.next;
                max = curr.val;
           }
        }
        return ReverseLL(head);
    }
}