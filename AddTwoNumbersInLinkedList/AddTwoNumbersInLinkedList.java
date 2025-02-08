import java.math.BigInteger;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1_rev = new StringBuilder();
        StringBuilder num2_rev = new StringBuilder();
        while(l1 != null){
            num1_rev.append(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            num2_rev.append(l2.val);
            l2 = l2.next;
        }
        String num1 = num1_rev.reverse().toString();
        String num2 = num2_rev.reverse().toString();
        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger sum = bigNum1.add(bigNum2);
        String res = sum.toString();
        ListNode result = null;
        for (int i = 0; i < res.length(); ++i) {
            ListNode newNode = new ListNode(Integer.parseInt(res.charAt(i) + ""));
            newNode.next = result;
            result = newNode;
        }
        return result;
    }
}

public class AddTwoNumbersInLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);

        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(4);

        ListNode result = sol.addTwoNumbers(head, head1);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
    }
}
