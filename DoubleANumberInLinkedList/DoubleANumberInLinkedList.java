class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode doubleIt(ListNode head) {
        if(head == null){
            return head;
        }
        String value = "";
        ListNode current = head;
        while(current != null){
            value += current.val;
            current = current.next;
        }
        String result = "";
        int len = value.length();
        int carry = 0;
        for (int i = value.length() - 1; i >= 0; --i) {
            int digit = Character.getNumericValue(value.charAt(i));
            int sum = 2 * digit + carry; 
            carry = sum / 10;
            result += sum % 10;
        }
        if(carry > 0){
            result += carry;
        }
        System.out.println(result);

        ListNode newHead = null;       
        for (int i = 0; i < result.length(); i++) {
            int digit = Character.getNumericValue(result.charAt(i));
            ListNode newNode = new ListNode(digit);
            newNode.next = newHead;
            newHead = newNode;
        }

        return newHead;
    }
}

public class DoubleANumberInLinkedList {
 public static void main(String[] args) {
    Solution sol = new Solution();
    ListNode head = new ListNode(9);
    head.next = new ListNode(9);
    head.next.next = new ListNode(9);
    ListNode result = sol.doubleIt(head);
    while(result != null){
        System.out.print(result.val);
        if(result.next != null){
            System.out.print("->");
        }
        result = result.next;
    }

 }   
}
