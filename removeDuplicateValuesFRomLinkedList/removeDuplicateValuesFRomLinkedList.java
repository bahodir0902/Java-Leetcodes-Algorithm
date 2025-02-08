import java.util.LinkedHashMap;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ListNode current = head;
        while(current != null){
            map.put(current.val, map.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        System.out.println(map);
        ListNode result = null;
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                ListNode newNode = new ListNode(i);
                newNode.next = result;
                result = newNode;
            }
        }
        head = null;
        ListNode temp = result;
        ListNode next = null;
        ListNode prev = null;
        while(temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        return head;
    }
}

public class removeDuplicateValuesFRomLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(1);
        head1.next.next.next.next = new ListNode(2);
        head1.next.next.next.next.next = new ListNode(3);

        ListNode result = sol.deleteDuplicates(head);
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
        System.out.println();
        ListNode result1 = sol.deleteDuplicates(head1);
        while(result1 != null){
            System.out.print(result1.val);
            if(result1.next != null){
                System.out.print("->");
            }
            result1 = result1.next;
        }
    }
}
