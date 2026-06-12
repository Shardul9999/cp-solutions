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
    public int numComponents(ListNode head, int[] nums) {
        List<Integer> lis = new ArrayList<>();
        int ans = 0;
        for(int a : nums){
            lis.add(a);
        }

        ListNode temp = head;
        while(temp != null){
            if(lis.contains(temp.val) && (temp.next == null || !lis.contains(temp.next.val))) ans++;
            temp = temp.next;
        }

        return ans;
    }
}