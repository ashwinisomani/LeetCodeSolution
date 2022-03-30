package LinkedList;

public class PalindromeList {
    public static void main(String[] args) {
        Node input = new Node(1);
        input.next = new Node(2);
        input.next.next = new Node(3);
        input.next.next.next = new Node(3);
        input.next.next.next.next = new Node(2);
        input.next.next.next.next.next = new Node(1);

        var palindrome = new PalindromeList();
        Boolean res = palindrome.palindromeLinkedList(input);
        System.out.println(res);


    }
    public Boolean palindromeLinkedList(Node head){
        if (head == null) return true;

        Node firstHalf = middleList(head);
        Node secondHalf = reverseLinkedList(firstHalf.next);

        Node p1 = head;
        Node p2 = secondHalf;
        Boolean result = true;
        while( p2!= null){
            if(p1.value != p2.value) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
    // restore list and print result

        firstHalf.next = reverseLinkedList(secondHalf);
        return result;

    }
    private Node reverseLinkedList(Node head){
      Node previous = null ;
      Node current = head;
         while( current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
      return previous;
    }

    private Node middleList(Node head){
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
