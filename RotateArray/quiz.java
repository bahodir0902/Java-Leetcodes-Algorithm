class node{
    node next;
    int data;
    public node(int data) {
        this.data = data;
    }
}

public class quiz {

    static void foo(node head){
        if(head == null){
            return;
        }
        foo(head.next);
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);       
        head.next.next = new node(3);       
        head.next.next.next = new node(4); 
        foo(head);      
    }
}
