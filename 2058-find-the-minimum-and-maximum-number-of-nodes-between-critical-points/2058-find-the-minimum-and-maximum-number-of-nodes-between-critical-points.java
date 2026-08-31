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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> lis = new ArrayList<>();
        ListNode prev = head;
        ListNode temp = head.next;
        int index = 1;

        while(temp != null && temp.next != null) {
            if ((temp.val < prev.val && temp.val < temp.next.val) ||
                (temp.val > prev.val && temp.val > temp.next.val)) {
                lis.add(index);
            }

            prev = temp;
            temp = temp.next;
            index++;
        }

        if(lis.size() < 2){
            return new int[] {-1, -1};
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < lis.size(); i++) {
            min = Math.min(min, lis.get(i) - lis.get(i - 1));
        }

        int max =  lis.get(lis.size() - 1) - lis.get(0);

        return new int [] {min,max};
    }
}