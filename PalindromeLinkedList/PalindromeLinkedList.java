class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;  
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode middle = slow;
        ListNode next = null;
        ListNode prev = null;
        ListNode current = middle;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode head_tail = prev;
        ListNode start_current = head;
        ListNode middle_current = head_tail;
        while(start_current != slow && middle_current != null){
            if(start_current.val != middle_current.val){
                return false;
            }else{
                start_current = start_current.next;
                middle_current = middle_current.next;
            }
        }
        return true;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode lst1 = new ListNode(1);
        lst1.next = new ListNode(2);
        lst1.next.next = new ListNode(1);
        lst1.next.next.next = new ListNode(2);

       System.out.println(sol.isPalindrome(lst1));

        // while(result != null){
        //     System.out.print(result.val);
        //     if(result.next != null){
        //         System.out.print("->");
        //     }
        //     result = result.next;
        // }
    }
}
