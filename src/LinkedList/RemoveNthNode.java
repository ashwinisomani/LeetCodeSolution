package LinkedList;

public class RemoveNthNode {
    public static void main(String[] args) {
     Node input = new Node(8);
     input.next = new Node(2);
     input.next.next = new Node(5);
     input.next.next.next = new Node(3);
     input.next.next.next.next = new Node(9);
     input.next.next.next.next.next = new Node(6);
     int target = 5;

     var remove = new RemoveNthNode();
     Node node = remove.removeNthFromEnd(input,target);
     System.out.println(node);

    }

    public Node removeNthFromEnd(Node l1 , int target){
     var start = new Node();
     start.next = l1;
     var fast = start;
     var slow = start;

     for (int i = 1 ; i <= target ; ++i )
     fast = fast.next;

     while (fast.next != null){
         fast = fast.next;
         slow = slow.next;
     }
     slow.next = slow.next.next;

     return start.next;

    }
}
