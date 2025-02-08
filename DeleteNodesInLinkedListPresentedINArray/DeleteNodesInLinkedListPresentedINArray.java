import java.util.HashSet;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head == null){
            return head;
        }
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode current = head;
        ListNode current_dummy = dummy;
        while(current != null){
            if(!map.contains(current.val)){
                ListNode newNode = new ListNode(current.val);
                current_dummy.next = newNode;
                current_dummy = current_dummy.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}

public class DeleteNodesInLinkedListPresentedINArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,3};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = sol.modifiedList(arr, head);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
    }
}
