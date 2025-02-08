class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null){
          return null;
        }
        if(head.next == null){
            head = null;
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode current = head;
        while(current.next != slow){
            current = current.next;
        }
        current.next = slow.next;
        return head;
    }
}

public class deleteMiddle {
  public static void main(String[] args) {
      Solution sol = new Solution();
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);        
      head.next.next = new ListNode(3);        
      head.next.next.next = new ListNode(4);        
      head.next.next.next.next = new ListNode(5);      
      head.next.next.next.next.next = new ListNode(6);      
      
      ListNode result = sol.deleteMiddle(head);
      while(result != null){
          System.out.print(result.val);
          if(result.next != null){
              System.out.print("->");
          }
          result = result.next;
      }
      System.out.println();
      ListNode head1 = new ListNode(1);
      head1.next = new ListNode(2);
      ListNode result1 = sol.deleteMiddle(head1);
      while(result1 != null){
          System.out.print(result1.val);
          if(result1.next != null){
              System.out.print("->");
          }
          result1 = result1.next;
      }
  }   
}
