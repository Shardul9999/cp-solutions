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
    public int LLlength(ListNode head){
        ListNode temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }
    public int pairSum(ListNode head) {
        int [] ans = new int[LLlength(head)];

        int i = 0;
        ListNode temp = head;
        while(temp != null){
            ans[i] = temp.val;
            i++;
            temp = temp.next;
        }

        int maxsum = 0;
        for(int j=0; j<ans.length; j++){
            maxsum = Math.max(maxsum, ans[j] + ans[ans.length - j - 1]);
        }

        return maxsum;
    }
}