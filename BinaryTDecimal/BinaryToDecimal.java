class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution{
    public int getDecimalValue(ListNode head) {
        if (head == null){
            return 0;        }
        String str = "";
        ListNode current = head;
        while(current != null){
            str += Integer.toString(current.val);
            current = current.next;
        }
        int dec_value = 0;
        for (int i = 0; i < str.length(); ++i) {
            dec_value += Integer.parseInt(str.charAt(i) + "") * Math.pow(2, str.length() - i - 1);
        }
        return dec_value;
    }
}
public class BinaryToDecimal {
    public static void main(String[] args) {
        Solution sol = new Solution();
         // Test case 1
         ListNode lst1 = new ListNode(1);
         lst1.next = new ListNode(0);
         lst1.next.next = new ListNode(1);
         System.out.println(sol.getDecimalValue(lst1)); // Output: 5
 
         // Test case 2 (the one you failed)
         ListNode lst2 = new ListNode(1);
         lst2.next = new ListNode(0);
         lst2.next.next = new ListNode(0);
         lst2.next.next.next = new ListNode(1);
         lst2.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next.next = new ListNode(1);
         lst2.next.next.next.next.next.next.next = new ListNode(1);
         lst2.next.next.next.next.next.next.next.next = new ListNode(1);
         lst2.next.next.next.next.next.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
         lst2.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
 
         System.out.println(sol.getDecimalValue(lst2)); // Expected output: 18880
    }
}

