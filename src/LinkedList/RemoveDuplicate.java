package LinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {
    Node input = new Node(1);
    input.next = new Node(1);
    input.next.next = new Node(2);
    input.next.next.next = new Node(3);
    input.next.next.next.next = new Node(3);

    var remove = new RemoveDuplicate();
    Node node = remove.removeDuplicateLinkedList(input);
    System.out.println(node);
    }

    public Node removeDuplicateLinkedList(Node head){
        Node current = head;
        while(current != null && current.next !=null){
         if(current.next.value == current.value) {
             current.next = current.next.next;
         }
         else {
             current = current.next;
          }
        }
        return head;
    }
}
