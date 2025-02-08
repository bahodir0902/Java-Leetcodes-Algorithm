class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;  
        }
        if(head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

public class MiddleNode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode lst1 = new ListNode(1);
        lst1.next = new ListNode(2);
        lst1.next.next = new ListNode(1);
        lst1.next.next.next = new ListNode(2);

       System.out.println(sol.middleNode(lst1));

        // while(result != null){
        //     System.out.print(result.val);
        //     if(result.next != null){
        //         System.out.print("->");
        //     }
        //     result = result.next;
        // }
    }
}
