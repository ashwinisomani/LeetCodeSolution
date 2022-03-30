package LinkedList;

public class DeleteElementInLinkedList {
    public static void main(String[] args) {
        Node input = new Node(5);
        input.next = new Node(7);
        input.next.next = new Node(9);
        input.next.next.next = new Node(2);

        var del = new DeleteElementInLinkedList();
        Node node = del.removeElements( input , 7);
        System.out.println(node);
    }

    public Node removeElements( Node head, int item){
        if(head == null) return head;
        Node current = head;
        while( current.next != null ){
            if(current.next.value == item)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head.value == item ? head.next: head;
    }
}

