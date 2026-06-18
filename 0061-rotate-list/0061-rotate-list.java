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
    public int Length(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null  || head.next == null || k == 0) return head;
        int n = Length(head);
        k = k % n;
        
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        
        ListNode pointer = head;
        ListNode prev = null;

        int steps = n - k;
        int count = 0;
        while(count < steps){
            prev = pointer;
            pointer = pointer.next;
            count++;
        }
        prev.next = null;

        return pointer;
    }
}