class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
  class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;  // Empty list, no cycle
        }
        ListNode fast = head;
        ListNode slow = head;

        // Use two pointers to detect cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            // Cycle detected
            if (slow == fast) {
                slow = head;

                // Find the entry point of the cycle
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;  // This is the start of the cycle
            }
        }

        return null;  // No cycle detected
    }
}


public class detectCycleInLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head;;
        

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = head1;
        

        ListNode result = sol.detectCycle(head);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
        System.out.println();
        ListNode result1 = sol.detectCycle(head1);
        while(result1 != null){
            System.out.print(result1.val);
            if(result1.next != null){
                System.out.print("->");
            }
            result1 = result1.next;
        }
    }
}
