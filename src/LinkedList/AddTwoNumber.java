package LinkedList;


public class AddTwoNumber {
 public static void main(String[] args) {
 Node inp1 = new Node(2);
 inp1.next = new Node(4);
 inp1.next.next = new Node(3);

  Node inp2 = new Node(5);
  inp2.next = new Node(6);
  inp2.next.next = new Node(7);
  inp2.next.next.next = new Node(9);

  var add = new AddTwoNumber();
  Node node = add.addTwoNumber(inp1,inp2);
  System.out.println(node);
 }

 public Node addTwoNumber(Node l1 , Node l2) {
  var dummyHead = new Node(0);
  var current = dummyHead;
  Node p = l1;
  Node q = l2;
  int carry = 0;

  while (p != null || q != null) {
   int x = (p != null) ? p.value : 0;
   int y = (q != null) ? q.value : 0;
   int sum = carry + x + y;
   carry = sum / 10;
   current.next = new Node(sum % 10);
   current = current.next;

   if (p != null) p = p.next;
   if (q != null) q = q.next;
  }
   if (carry > 0) {
    current.next = new Node(carry);
   }
   return dummyHead.next;
  }
 }


