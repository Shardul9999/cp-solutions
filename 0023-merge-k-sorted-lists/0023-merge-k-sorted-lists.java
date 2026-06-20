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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                tail.next = temp1;
                temp1 = temp1.next;
            }
            else{
                tail.next = temp2;
                temp2 = temp2.next;
            }
            tail = tail.next;
        }
        
        if(temp1 != null){
            tail.next = temp1;
        }
        else{
            tail.next = temp2;
        }
        
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        while(lists.length > 1){
            List<ListNode> temp = new ArrayList<>();

            for(int i=0; i<lists.length; i+=2){
                ListNode l1= lists[i];
                ListNode l2 = null;
                if(i+1 < lists.length){
                    l2 = lists[i+1];
                }
                temp.add(mergeTwoLists(l1, l2));
            }
            lists = temp.toArray(new ListNode[0]);
        }
        return lists[0];
    }
}