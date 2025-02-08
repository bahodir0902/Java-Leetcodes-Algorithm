import java.util.ArrayList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        ArrayList<Integer> result = new ArrayList<>();
        while(current != null){
            ListNode temp = current;
            int value = Integer.MIN_VALUE;
            while(temp != null){
                value = temp.val; 
                if(temp.val > current.val){
                    break;
                }
                if(temp.next == null){
                    result.add(0);
                    break;
                }               
                temp = temp.next;
            }
            
            if(current.val < temp.val){
                value = temp.val;
                result.add(temp.val);
             }else{
                
            }
            current = current.next;
        }
        System.out.println(result);
        int size = result.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = result.get(i);
        }
        return arr;
        
    }
}

public class nextGreaterNodeInLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);

        int[] arr = sol.nextLargerNodes(head);

    }
}
