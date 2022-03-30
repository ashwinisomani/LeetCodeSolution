package LinkedList;
//sorted linked list
//optimal solution

public class MergeTwoList {
    public static void main(String[] args) {

        Node inp1 = new Node(5);
        inp1.next = new Node(7);
        inp1.next.next = new Node(9);

        Node inp2 = new Node(3);
        inp2.next = new Node(4);
        inp2.next.next = new Node(8);
        inp2.next.next.next = new Node(10);

        var merge = new MergeTwoList();
        Node node = merge.mergeTwoLinkedList(inp1,inp2);
        System.out.println(node);

    }

    public Node mergeTwoLinkedList(Node l1, Node l2){
   var dummyHead = new Node(0);
   var head = dummyHead;

   while(l1 != null && l2!= null) {
       if (l1.value < l2.value) {
           head.next = l1;
           l1 = l1.next;
       } else {
           head.next = l2;
           l2 = l2.next;
       }
       head = head.next;
   }
    if (l1 == null)head.next = l2;
    if (l2 == null)head.next = l1;
    return dummyHead.next;

    }
}

