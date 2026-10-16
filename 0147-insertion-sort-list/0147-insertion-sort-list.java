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
    public List<Integer> TarverseLL(ListNode head){
        List<Integer> lis = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            lis.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(lis);
        return lis;
    }
    public ListNode insertionSortList(ListNode head) {
        List<Integer> ans = TarverseLL(head);
        ListNode Newhead = new ListNode(ans.get(0));
        ListNode temp = Newhead;
        int i = 1;
        while(i < ans.size()){
            temp.next = new ListNode(ans.get(i));
            temp = temp.next;
            i++;
        }
        return Newhead;
    }
}