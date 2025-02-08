import java.math.BigInteger;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode current = head;
        int size = 1;
        while(current.next != null){
            ++size;
            current = current.next;
        }
        current.next = head;
        System.out.println(size);

        k = k % size;
        if(k == 0){
            current.next = null;
            return head;
        }
        int to_rotate_index = size - k;
        int counter = 1;
        ListNode temp = head;
        while(counter < to_rotate_index){
            ++counter;
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        

        return newHead;
    }
}
public class rotateLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        //head1.next.next = new ListNode(2);

        ListNode result = sol.rotateRight(head, 2);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
        System.out.println();
        ListNode result1 = sol.rotateRight(head1, 3);
        while(result1 != null){
            System.out.print(result1.val);
            if(result1.next != null){
                System.out.print("->");
            }
            result1 = result1.next;
        }
    }
}
