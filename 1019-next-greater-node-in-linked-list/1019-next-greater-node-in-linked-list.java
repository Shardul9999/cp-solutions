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
    public int listlength(ListNode head){
        if(head == null) return 0;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public int[] nextLargerNodes(ListNode head) {
        int LLsize = listlength(head);
        int [] ans = new int[LLsize];

        ListNode outer = head;
        int i=0;
        while(outer != null){
            ListNode inner = outer;
            boolean found = false;
            while(inner != null){
                if(outer.val < inner.val){
                    found = true;
                    ans[i] = inner.val;
                    i++;
                    break;
                }
                inner = inner.next;
            }
            if(found == false){
                ans[i] = 0;
                i++;
            }
            outer = outer.next;
        }
        return ans;
    }
}