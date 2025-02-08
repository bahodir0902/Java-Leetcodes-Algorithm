class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = current;

        while(head != null && head.val == val){
            head = head.next;
        }
        while(current != null){
            if(current.val == val){
                prev.next = current.next;
                current = current.next;
            }else{
                prev = current;
                current = current.next;
            }   
        }
        return head;
    }
}

public class removeElements {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode lst1 = new ListNode(1);
        lst1.next = new ListNode(1);
        lst1.next.next = new ListNode(2);
        lst1.next.next.next = new ListNode(3);
        lst1.next.next.next.next = new ListNode(3);
        lst1.next.next.next.next.next = new ListNode(4);
        lst1.next.next.next.next.next.next = new ListNode(4);

        ListNode result = sol.removeElements(lst1, 1);

        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
    }
}
