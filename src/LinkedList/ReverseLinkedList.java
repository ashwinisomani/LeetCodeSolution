package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
    Node input = new Node(1);
    input.next = new Node(2);
    input.next.next = new Node(3);
    input.next.next.next = new Node(4);

    var reverse = new ReverseLinkedList();
    Node node = reverse.reverseList(input);
    System.out.println(node);
    }

    public Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}