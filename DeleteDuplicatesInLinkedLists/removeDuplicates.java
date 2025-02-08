
import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Duplicates {
    public ListNode deleteDuplicates(ListNode head) {
        /*HashMap<Integer, Integer> map = new HashMap<>();
        ListNode current = head;
        while(current != null){
            map.put(current.val, map.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        System.out.println(map);
        ListNode temp = new ListNode(Integer.MIN_VALUE);
        ListNode result = temp;
        for(Integer i : map.keySet()){
            result.next = new ListNode(i);
            result = result.next;
            
        }
        return temp.next;*/
        ListNode current = head;
        if(head == null) return head;
        
        while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        
        return head;
    }
}

public class removeDuplicates {
    public static void main(String[] args) {

        Duplicates sol = new Duplicates();
        ListNode lst1 = new ListNode(1);
        lst1.next = new ListNode(1);
        lst1.next.next = new ListNode(2);
        lst1.next.next.next = new ListNode(3);
        lst1.next.next.next.next = new ListNode(3);
        lst1.next.next.next.next.next = new ListNode(4);
        lst1.next.next.next.next.next.next = new ListNode(4);
        // lst1.next = new ListNode(-3);
        // lst1.next.next = new ListNode(-1);
        // lst1.next.next.next = new ListNode(0);
        // lst1.next.next.next.next = new ListNode(0);
        // lst1.next.next.next.next.next = new ListNode(0);
        // lst1.next.next.next.next.next.next = new ListNode(3);
        // lst1.next.next.next.next.next.next.next = new ListNode(3);
        ListNode result = sol.deleteDuplicates(lst1);

        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print("->");
            }
            result = result.next;
        }
    }       
}
