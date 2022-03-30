package LinkedList;

public class MiddleLinkedList {
    public static void main(String[] args) {
        Node input = new Node(3);
        input.next = new Node(6);
        input.next.next = new Node(9);
        input.next.next.next = new Node(8);
        input.next.next.next.next = new Node(2);
        input.next.next.next.next.next = new Node(1);


        var middle = new MiddleLinkedList();
        Node node = middle.middleNode(input);
        System.out.println(node);
    }
        public Node middleNode(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

