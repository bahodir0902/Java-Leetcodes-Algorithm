class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        ListNode current = head;
        int size = 0;
        while(current != null){
            ++size;
            current = current.next;
        }
        System.out.println(size);
        int delete_index = size - n;
        int counter = 0;
        if(delete_index == 0){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        while(counter < delete_index - 1){
            temp = temp.next;
            ++counter;
        }
        temp.next = temp.next.next;
        return head;
    }
}
public class removeNthNodeFromEnd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // ListNode head = new ListNode(1);
        // head.next = new ListNode(2);        
        // head.next.next = new ListNode(3);        
        // head.next.next.next = new ListNode(4);        
        // head.next.next.next.next = new ListNode(5);      
        
        // ListNode result = sol.removeNthFromEnd(head, 2);
        // while(result != null){
        //     System.out.print(result.val);
        //     if(result.next != null){
        //         System.out.print("->");
        //     }
        //     result = result.next;
        // }

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        ListNode result1 = sol.removeNthFromEnd(head1, 2);
        while(result1 != null){
            System.out.print(result1.val);
            if(result1.next != null){
                System.out.print("->");
            }
            result1 = result1.next;
        }
    }   
}
