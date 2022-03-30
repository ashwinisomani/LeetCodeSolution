package LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        Node input = new Node(3);
        input.next = new Node(2);
        input.next.next = new Node(0);
        input.next.next.next = new Node(-4);
        int pos = 1;
        var cycle = new LinkedListCycle();
        boolean res = cycle.linkedListCycle(input , pos);
        System.out.println(res);
    }

    public boolean linkedListCycle(Node head , int pos){

        if(head==null)return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
}