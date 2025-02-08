class Node{
    public Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
class Solution{
    public void recursive(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        recursive(node.next);
    }
}
public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node node = new Node(-1); 
        node.next = new Node(5);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(0);

        sol.recursive(node);

    }
}
