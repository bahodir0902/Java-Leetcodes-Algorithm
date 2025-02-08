class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
        if(head.next == null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode until_middle = head;
        while(until_middle.next != slow){
            until_middle = until_middle.next;
        }
        until_middle.next = null;
        ListNode next = null;
        ListNode prev = null;
        ListNode current = slow;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode current_left = head;
        ListNode current_right = prev;

        while(current_left != null && current_right != null){
            ListNode first = current_left.next;
            ListNode second = current_right.next;

            current_left.next = current_right;
            if (first != null) { 
                current_right.next = first;
            }

            current_left = first;
            current_right = second;
        }   
        
    }
}
public class ReOrderLinkedLists {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        sol.reorderList(head);
        while(head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
    }    
}
