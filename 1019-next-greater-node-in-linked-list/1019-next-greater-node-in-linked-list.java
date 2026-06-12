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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();

        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int n = values.size();
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0; i < n; i++){
            while(!st.isEmpty() && values.get(i) > values.get(st.peek())){
                ans[st.pop()] = values.get(i);
            }
            st.push(i);
        }

        return ans;
    }
}