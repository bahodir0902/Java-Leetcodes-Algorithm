import java.math.BigInteger;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next== null){
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        while(head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            prev = first;
            head = first.next;

        }
        return dummy.next;
    }
}
public class swapNodes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(4);

        ListNode result = sol.swapPairs(head);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }

        ListNode result1 = sol.swapPairs(head1);
        while(result != null){
            System.out.print(result1.val);
            if(result1.next != null){
                System.out.print("->");
            }
            result1 = result1.next;
        }
    }
}
