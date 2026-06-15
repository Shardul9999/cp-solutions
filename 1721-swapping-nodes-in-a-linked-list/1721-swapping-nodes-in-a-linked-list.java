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
    public int length(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int back_K = length(head) - k + 1;
        ListNode slow = head;
        ListNode fast = head;

        int first = 1;
        int second = 1;

        while(first != k){
            slow = slow.next;
            first++;
        }

        while(second != back_K && fast.next != null){
            fast = fast.next;
            second++;
        }

        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;

        return head;
    }
}