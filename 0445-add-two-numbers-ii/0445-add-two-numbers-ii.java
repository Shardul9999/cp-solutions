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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ZERO;
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while(temp1 != null){
            num1 = num1.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(temp1.val));
            temp1 = temp1.next;
        }

        while(temp2 != null){
            num2 = num2.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(temp2.val));
            temp2 = temp2.next;
        }

        BigInteger ans = num1.add(num2);
        if (ans.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }
        ListNode head = null;

        while(ans.compareTo(BigInteger.ZERO) > 0){
            BigInteger[] divideAndRemainder = ans.divideAndRemainder(BigInteger.valueOf(10));
            int digit = divideAndRemainder[1].intValue(); 
            ListNode node = new ListNode(digit);
            node.next = head;
            head = node;
            ans = divideAndRemainder[0];
        }
        return head;
    }
}