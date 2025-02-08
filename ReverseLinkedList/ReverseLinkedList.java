class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        if (head.next == null) return head;

        ListNode next = null;
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode lst1 = new ListNode(1);
        lst1.next = new ListNode(2);
        lst1.next.next = new ListNode(3);
        lst1.next.next.next = new ListNode(4);
        lst1.next.next.next.next = new ListNode(5);
        lst1.next.next.next.next.next = new ListNode(6);
        lst1.next.next.next.next.next.next = new ListNode(7);

        ListNode result = sol.reverseList(lst1);

        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
    }
}
