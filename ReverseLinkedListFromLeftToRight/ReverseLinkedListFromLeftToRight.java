
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        /*ListNode newHead = null;
        ListNode current_head = null;
        ListNode trash = head;
        int counter = 1;
        while (counter < left && trash != null) {
            ListNode newNode = new ListNode(trash.val); // Create a new node with the current value

            if (newHead == null) {
                newHead = newNode; // Set newHead to the first node
                current_head = newHead; // Initialize currentHead to point to newHead
            } else {
                current_head.next = newNode; // Add the new node to the new list
                current_head = current_head.next; // Move currentHead to the next node
            }

            trash = trash.next; // Move to the next node in the original list
            ++counter; // Increment the counter
        }
        ListNode current = head;
        ListNode temp = head;
        ListNode end = null;
        for (int i = 0; i < right; i++) {
            temp = temp.next;
        }
        // Now, we are at the node with the given index. Let's create the new linked list.
        ListNode newTail = new ListNode(temp.val);  // Create the first node of the new list
        ListNode newCurrent = newTail;
        // Copy the rest of the nodes from the original list to the new list
        temp = temp.next;
        while (temp != null) {
            newCurrent.next = new ListNode(temp.val);  // Create new nodes for the new list
            newCurrent = newCurrent.next;
            temp = temp.next;
        }
        for (int i = 1; i < left; ++i) {
            current = current.next;
        }
        
        ListNode next = null;
        ListNode prev = null;
        while(left <= right){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            ++left;
        }
        ListNode reversed  = prev;
        
        ListNode current_reversed = reversed;
        while(current_reversed.next != null){
            current_reversed = current_reversed.next;
        }
        
        current = null;
        current = newHead;
        while(current.next != null){
            current = current.next;
        }
        current.next = reversed;
        current_reversed.next = newTail;
        
        return newHead;*/

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode next = null;
        ListNode current = prev.next;
        ListNode prevSubList = null;
        
        for (int i = 0; i < right - left + 1; ++i) {
            next = current.next;
            current.next = prevSubList;
            prevSubList = current;
            current = next;
        }

        prev.next.next = current;
        prev.next = prevSubList;

        return dummy.next;



    }
}
public class ReverseLinkedListFromLeftToRight {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);

        ListNode result = sol.reverseBetween(head, 3,4);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
        System.out.println();
        ListNode result1 = sol.reverseBetween(head1,1,3);
        while(result1 != null){
            System.out.print(result1.val);
            if(result1.next != null){
                System.out.print("->");
            }
            result1 = result1.next;
        }
    }
}
