package LinkedList;

public class ReverseNodeKGroup {
    public static void main(String[] args) {

        Node inp1 = new Node(1);
        inp1.next = new Node(2);
        inp1.next.next = new Node(3);
        inp1.next.next.next = new Node(4);
        inp1.next.next.next.next = new Node(5);
        inp1.next.next.next.next.next = new Node(6);
        inp1.next.next.next.next.next.next = new Node(7);
        inp1.next.next.next.next.next.next.next = new Node(8);

        var reverse = new ReverseNodeKGroup();
        Node node = reverse.reverseKGroup(inp1,3);
        System.out.println(node);

    }

    public Node reverseKGroup( Node head , int k) {
        if (head == null || k == 1) return head;             //cannot reverse one number

        Node dummy = new Node(0);
        dummy.next = head;
        var current = dummy;
        var previous = dummy;
        var next = dummy;
        int count = 0;

 //size of the linkedList
        while(current.next != null) {
            current = current.next;
            count++;
        }

        while(count >= k){
            current = previous.next;
            next = current.next;
            for(int i = 1 ; i < k ; i++){
                current.next = next.next;
                next.next = previous.next;
                previous.next = next;
                next = current.next;
            }

            previous = current;
            count-= k;
        }
        return dummy.next;
    }
}
