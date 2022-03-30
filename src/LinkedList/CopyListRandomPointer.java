package LinkedList;

public class CopyListRandomPointer {
    public static void main(String[] args) {
     Node input = new Node(1);
     input.next = new Node(2);
     input.next.next = new Node(3);
     input.next.next.next = new Node(4);
//
//     input.random = new

    }

 public static class Node{
  private int value;
  private Node next;
  private Node random;

     public Node(int value) {
         this.value  = value;
         this.next   = null;
         this.random = null;
     }
 }

 public Node copyListWithRandomPointer(Node head){
        Node p = head;
        if (p == null) return null;

//create copy of each node
     Node copy = new Node(p.value);
     while(p != null) {
        copy.next = p.next;
        p.next = copy;                       //break the link
        p = copy.next;
    }
// Copy Random Pointer
      p = head;
     while(p != null){
         if (p.random != null)
         p.next.random = p.random.next;
         p = p.next.next;
     }
//break link into two
     p = head;
     Node newHead = head.next;
     while(p!=null){
     Node temp = p.next;
     p.next = temp.next;
     if(temp.next != null)
         temp.next = temp.next.next;
         p = p.next;
     }
     return newHead;
 }
}
