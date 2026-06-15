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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st = new HashSet<>();
        for(int x : nums){
            st.add(x);
        }

        while(head != null && st.contains(head.val)){
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            if(st.contains(temp.val)){
                prev.next = temp.next;
            }
            else{
                prev = temp;
            }
            temp = temp.next;
        }

        return head;
    }
}